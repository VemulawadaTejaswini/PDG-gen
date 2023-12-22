import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EBomber solver = new EBomber();
        solver.solve(1, in, out);
        out.close();
    }

    static class EBomber {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int r = in.nextInt();
            int c = in.nextInt();
            int n = in.nextInt();
            EBomber.MyPair[] a = nextArrPair(in, n);
            int res = solveMe(r, c, n, a);
            out.print(res);
            //out.print("Case #"+ testNumber + ": ");
        }

        private int solveMe(int r, int c, int n, EBomber.MyPair[] a) {
            int[] nbByCol = new int[c];
            EBomber.Input[] input = new EBomber.Input[r];
            for (int i = 0; i < r; i++)
                input[i] = new EBomber.Input(0);
            ArrayList<Integer>[] targetsByCol = new ArrayList[c];
            for (int i = 0; i < c; i++)
                targetsByCol[i] = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = (int) a[i].first - 1;
                int y = ((int) a[i].second) - 1;
                input[x].val++;
                nbByCol[y]++;
                targetsByCol[y].add(x);
            }

            //d("targetsByCol = " + stringMe(targetsByCol));
            int res = 0;
            EBomber.SegmentTreeFast st = new EBomber.SegmentTreeFast(input, false);
            for (int i = 0; i < c; i++) {
                //d("[" + i + "] BEFORE st = " + st);
                for (int j : targetsByCol[i]) {
                    st.updateMe(j, new EBomber.Input(-1));
                }
                //d("[" + i + "] AFTER 1 st = " + st);
                if (i > 0) {
                    for (int j : targetsByCol[i - 1]) {
                        st.updateMe(j, new EBomber.Input(1));
                    }
                }

                //d("[" + i + "] AFTER 2 st = " + st);

                //d("[" + i + "] GET = " + st.getMe(0, r-1).val);

                res = Math.max(res, nbByCol[i] + (int) st.getMe(0, r - 1).val);
            }

            return res;
        }

        private static int prevBaseOf2(long n) {
            return 63 - Long.numberOfLeadingZeros(n);
        }

        private static StringBuilder repeatSb(StringBuilder sb, String pattern, int n) {
            for (int i = 0; i < n; i++) {
                sb.append(pattern);
            }
            return sb;
        }

        private static String rightPad(String a, char padding, int n) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            return repeatSb(sb, "" + padding, Math.max(0, n - a.length())).toString();
            //return String.format("%1$-" + n + "s", a).replace(' ', padding);   //Does not work if "a" has empty space
        }

        private static String stringMeDeb(EBomber.SegmentTreeFast st, int withNoneAdditionnalAllRanges, boolean withId) {
            int n = st.n;
            EBomber.Vertex[] vertices = new EBomber.Vertex[2 * n];
            int[] start = new int[2 * n];
            int[] end = new int[2 * n];
            for (int i = 1; i < 2 * n; i++) {
                vertices[i] = new EBomber.Vertex();
                vertices[i].label = (withId ? "(" + i + ") " : "") + st.segmentTree[i] + (st.isWithLazy && i < n ? " " + st.lazy[i] : "");
            }

            if (withNoneAdditionnalAllRanges == 2) {
                for (int i = n; i < 2 * n; i++) {
                    start[i] = end[i] = i - n;
                    vertices[i].label = "[" + start[i] + "] " + vertices[i].label;
                }

                for (int i = n - 1; i > 0; i--) {
                    start[i] = start[2 * i];
                    end[i] = end[2 * i + 1];
                    vertices[i].label = "[" + start[i] + ", " + end[i] + "] " + vertices[i].label;
                }
            }

            for (int i = n - 1; i > 0; i--) {
                vertices[i].children = new ArrayList<>();
                vertices[i].children.add(vertices[2 * i]);
                vertices[i].children.add(vertices[2 * i + 1]);
                vertices[2 * i].father = vertices[i];
                vertices[2 * i + 1].father = vertices[i];
            }

            for (int i = Integer.numberOfTrailingZeros(n); i < st.depth; i++) {
                vertices[n >> (i + 1)] = null;
            }

            //Create the roots of the forest
            List<EBomber.Vertex> roots = new ArrayList<>();
            int iPos = n;
            while (iPos < 2 * n) {
                int generation = 0;
                int lastGeneration = generation;
                EBomber.Vertex lastVertex = vertices[iPos];
                while (vertices[iPos >> generation] != null) {
                    lastGeneration = generation;
                    lastVertex = vertices[iPos >> generation];
                    generation++;
                }

                int nextIPos = iPos + (1 << lastGeneration);
                //Put the leaves down
                while (lastGeneration + 1 <= st.depth) {
                    EBomber.Vertex vertex = new EBomber.Vertex();
                    vertex.label = "-";
                    lastVertex.father = vertex;
                    vertex.children = new ArrayList<>();
                    vertex.children.add(lastVertex);
                    lastVertex = vertex;
                    lastGeneration++;
                }
                roots.add(lastVertex);
                iPos = nextIPos;
            }

            if (withNoneAdditionnalAllRanges == 1) {
                for (int i = n; i < 2 * n; i++) {
                    vertices[i].children = new ArrayList<>();
                    EBomber.Vertex vertex = new EBomber.Vertex();
                    vertex.label = "[" + (i - n) + "]";
                    vertices[i].children.add(vertex);
                }
            }
            return stringMeDeb(new EBomber.Forest(roots));
        }

        private static String stringMeDeb(EBomber.Forest f) {
            for (EBomber.Vertex root : f.roots) {
                root.setCellMinLength();
            }

            List<List<EBomber.Vertex>> vertices = new ArrayList<>();
            List<EBomber.Vertex> currentRoots = f.roots;
            vertices.add(currentRoots);
            while (!currentRoots.isEmpty()) {
                List<EBomber.Vertex> newCurrentRoots = new ArrayList<>();
                for (EBomber.Vertex root : currentRoots) {
                    if (root.children != null)
                        newCurrentRoots.addAll(root.children);
                }
                currentRoots = newCurrentRoots;
                if (currentRoots.isEmpty())
                    break;
                vertices.add(currentRoots);
            }

            String[][] cells = new String[vertices.size()][];
            int[][] cellMinLength = new int[vertices.size()][];
            for (int i = 0; i < vertices.size(); i++) {
                List<EBomber.Vertex> vertexList = vertices.get(i);
                cells[i] = new String[vertexList.size()];
                cellMinLength[i] = new int[vertexList.size()];
                for (int j = 0; j < cells[i].length; j++) {
                    cells[i][j] = "" + vertexList.get(j);
                    cellMinLength[i][j] = vertexList.get(j).cellMinLength;
                }
            }
            return stringMeDeb(cells, cellMinLength);
        }

        private static <T> String stringMeDeb(T[][] a, int[][] cellMinLength) {
            return stringMeDeb(a, null, null, cellMinLength);
        }

        private static <T> String stringMeDeb(T[][] a, Integer maxI, Integer maxJ, int[][] cellMinLength) {
            StringBuilder sb = new StringBuilder();
            sb.append("\n");
            stringMeDebAppend(a, maxI, maxJ, sb, cellMinLength);
            return sb.toString();
        }

        private static <T> void stringMeDebAppend(T[][] a, Integer maxJ, StringBuilder sb, int start, int end, int[] minLength) {
            end = Math.min(a.length - 1, end);

            if (minLength == null) {
                int totalNbColumns = 0;
                for (int i = start; i <= end; i++)
                    totalNbColumns = Math.max(totalNbColumns, a[i].length);
                minLength = new int[totalNbColumns];

                for (int i = start; i <= end; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        minLength[j] = Math.max(minLength[j], ("" + a[i][j]).length());
                    }
                }
            }

            int totalNbColumns = minLength.length;
            int minLengthLeft = ("[" + end + "] ").length();
            repeatSb(sb, " ", minLengthLeft);
            String[] header = new String[totalNbColumns];
            for (int i = 0; i < totalNbColumns; i++) {
                header[i] = "[" + i + "] ";
                minLength[i] = Math.max(minLength[i], header[i].length());
            }

            stringMeDebAppend(header, maxJ, sb, minLength);
            sb.append("\n");
            for (int i = start; i <= end; i++) {
                sb.append(rightPad("[" + i + "] ", ' ', minLengthLeft));
                stringMeDebAppend(a[i], maxJ, sb, minLength);
                sb.append("\n");
            }
        }

        private static <T> void stringMeDebAppend(T[][] a, Integer maxI, Integer maxJ, StringBuilder sb, int[][] minCellLength) {
            if (maxI == null)
                maxI = 100;
            int firstPart = maxI * 9 / 10;
            if (a.length > maxI) {
                stringMeDebAppend(a, maxJ, sb, 0, firstPart, minCellLength);
                sb.append("...\n");
                stringMeDebAppend(a, maxJ, sb, a.length - maxI + firstPart, a.length - 1, minCellLength);
            } else {
                stringMeDebAppend(a, maxJ, sb, 0, a.length - 1, minCellLength);
            }
        }

        private static <T> void stringMeDebAppend(T[][] a, Integer maxJ, StringBuilder sb, int start, int end, int[][] minCellLength) {
            if (minCellLength == null) {
                stringMeDebAppend(a, maxJ, sb, start, end, (int[]) null);
                return;
            }

            end = Math.min(a.length - 1, end);

            for (int i = start; i <= end; i++) {
                stringMeDebAppend(a[i], maxJ, sb, minCellLength[i]);
                sb.append("\n");
            }
        }

        private static <T> void stringMeDebAppend(T[] a, Integer maxI, StringBuilder sb, int[] minLength) {
            int nbColumns = minLength != null ? minLength.length : a.length;

            if (maxI == null)
                maxI = 100;
            int firstPart = maxI * 9 / 10;
            if (a.length >= maxI) {
                stringMeDebAppend(a, sb, 0, firstPart, minLength);
                sb.append(" ... ");
                stringMeDebAppend(a, sb, nbColumns - maxI + firstPart, nbColumns - 1, minLength);
            } else {
                stringMeDebAppend(a, sb, 0, a.length - 1, minLength);
            }
        }

        private static <T> void stringMeDebAppend(T[] a, StringBuilder sb, int start, int end, int[] minLength) {
            end = Math.min(a.length - 1, end);

            sb.append("|");
            for (int i = start; i <= end; i++) {
                if (minLength == null)
                    sb.append(a[i]).append("|");
                else
                    sb.append(rightPad("" + a[i], ' ', minLength[i])).append("|");
                //sb.append(String.format("%1$-" + minLength + "s", a[i]));
            }
        }

        private static EBomber.MyPair[] nextArrPair(FastReader in, int n) {
            EBomber.MyPair[] a = new EBomber.MyPair[n];
            for (int i = 0; i < a.length; i++)
                a[i] = new EBomber.MyPair(in.nextLong(), in.nextLong());
            return a;
        }

        private static String s(Object... list) {
            boolean isVariableName = true;
            boolean isFirst = true;
            StringBuilder sb = new StringBuilder();
            for (Object element : list) {
                if (isVariableName) {
                    if (!isFirst) {
                        sb.append("; ");
                    }
                    sb.append(element);
                } else {
                    sb.append(" : ").append(element);
                    isFirst = false;
                }
                isVariableName = !isVariableName;
            }
            return sb.toString();
        }

        private static void assertTrueCheckMsgTLE(boolean shouldBeTrue, Object... objects) {
            if (!shouldBeTrue)
                throw new RuntimeException(s(objects));
        }

        private static class Segment {
            long val;

            public Segment() {
            }

            public Segment(long val) {
                this.val = val;
            }

            public Segment(EBomber.Segment segment) {
                this(segment.val);
            }

            public String toString() {
                return "" + val;
            }

        }

        private static class Input {
            long val;

            public Input() {
            }

            public Input(long val) {
                this.val = val;
            }

            public String toString() {
                return "" + val;
            }

        }

        private static class SegmentTreeFast {
            int n;
            boolean isWithLazy;
            EBomber.Segment[] segmentTree;
            EBomber.Input[] lazy;
            int depth;

            public EBomber.Segment getLeafSegment(EBomber.Segment inout, EBomber.Input val) {
                inout.val = val.val;
                return inout;
            }

            public EBomber.Segment combineInternalLoop(EBomber.Segment inout, EBomber.Segment left, EBomber.Segment right) {
                inout.val = Math.max(left.val, right.val);
                return inout;
            }

            private EBomber.Input incLazy(EBomber.Input inout, EBomber.Input incLazy) {
                inout.val += incLazy.val;
                return inout;
            }

            private EBomber.Segment incSegment(EBomber.Segment inout, EBomber.Input incLazy) {
                inout.val += incLazy.val;
                return inout;
            }

            private EBomber.Input resetLazy(EBomber.Input inout) {
                inout.val = 0;
                return inout;
            }

            public SegmentTreeFast(EBomber.Input[] a, EBomber.Input[] lazy, boolean isWithLazy) {
                this.n = a.length;
                this.isWithLazy = isWithLazy;
                segmentTree = new EBomber.Segment[2 * n];
                this.depth = prevBaseOf2(n);

                for (int i = 0; i < 2 * n; i++)
                    segmentTree[i] = new EBomber.Segment();

                for (int i = 0; i < n; i++) {
                    segmentTree[n + i] = getLeafSegment(segmentTree[n + i], a[i]);
                }

                if (isWithLazy && lazy == null) {
                    lazy = new EBomber.Input[n];
                    for (int i = 0; i < n; i++) {
                        lazy[i] = new EBomber.Input();
                    }
                }
                this.lazy = lazy;
                build();
            }

            public SegmentTreeFast(EBomber.Input[] a, boolean isWithLazy) {
                this(a, null, isWithLazy);
            }

            private void build() {
                for (int i = n - 1; i > 0; i--) {
                    updateSegment(i);
                }
            }

            void updateMe(int tindex, EBomber.Input value) {
                assertTrueCheckMsgTLE(tindex >= 0 && tindex < n, "tindex (" + tindex + ") is not in range [0, " + n + "]");
                segmentTree[tindex + n] = getLeafSegment(segmentTree[tindex + n], new EBomber.Input(value.val + segmentTree[tindex + n].val));

                pushUp(tindex);
            }

            EBomber.Segment getMe(int start0, int end0) {
                assertTrueCheckMsgTLE(start0 <= end0 && start0 >= 0 && end0 < n, "start0 (" + start0 + ") or end0 (" + end0 + ") is not in range [0, " + n + "]");
                int start = start0 + n;
                int end = end0 + n;

                if (isWithLazy) {
                    pushDownLazy(start);
                    pushDownLazy(end);
                }

                end++;
                EBomber.Segment resL = null;
                EBomber.Segment resR = null;
                while (start < end) {
                    if ((start & 1) == 1) {
                        //d("ADD START : " + s("resL", stringMe(resL), "resR", stringMe(resR)), "i", start, "level", level);
                        if (resL == null)
                            resL = new EBomber.Segment(segmentTree[start]);
                        else
                            resL = combineInternalLoop(resL, resL, segmentTree[start]);
                        start++;
                    }
                    if ((end & 1) == 1) {
                        end--;
                        //d("ADD END : " + s("resL", stringMe(resL), "resR", stringMe(resR)), "i", end, "level", level);
                        if (resR == null)
                            resR = new EBomber.Segment(segmentTree[end]);
                        else
                            resR = combineInternalLoop(resR, segmentTree[end], resR);
                    }

                    start >>= 1;
                    end >>= 1;
                }

                //d(s( "resL", stringMe(resL), "resR", stringMe(resR)));
                if (resL == null)
                    return resR;
                if (resR == null)
                    return resL;
                return combineInternalLoop(resL, resL, resR);
            }

            void pushUp(int tindex) {
                int pos = tindex + n;
                while (pos > 1) {
                    pos >>= 1;
                    updateSegment(pos);
                }
            }

            private void pushDownLazy(int tindex) {
                for (int level = 0; level < depth; level++) {
                    int indexFather = tindex >> (depth - level);
                    inc(indexFather << 1, lazy[indexFather]);
                    inc(indexFather << 1 | 1, lazy[indexFather]);
                    lazy[indexFather] = resetLazy(lazy[indexFather]);
                    //segmentTree[indexFather] = combineInternalLoop(segmentTree[indexFather << 1], segmentTree[indexFather << 1 | 1]);
                }
            }

            void updateSegment(int tindex) {
                EBomber.Segment s1, s2;
                s1 = getSegment(tindex << 1);
                s2 = getSegment(tindex << 1 | 1);
                segmentTree[tindex] = combineInternalLoop(segmentTree[tindex], s1, s2);
            }

            private EBomber.Segment getSegment(int tindex) {
                EBomber.Segment segment = new EBomber.Segment(segmentTree[tindex]);
                if (isWithLazy) {
                    segment = incSegment(segment, lazy[tindex >> 1]);
                }
                return segment;
            }

            public void inc(int tindex, EBomber.Input incLazy) {
                segmentTree[tindex] = incSegment(segmentTree[tindex], incLazy);
                if (tindex < n)
                    lazy[tindex] = incLazy(lazy[tindex], incLazy);
            }

            public String toString() {
                return toString(1, false);
            }

            public String toString(int withNoneLastAllRanges, boolean withId) {
                return stringMeDeb(this, withNoneLastAllRanges, withId);
            }

        }

        private static class MyPair implements Comparable<EBomber.MyPair> {
            long first;
            long second;

            public MyPair(long first, long second) {
                this.first = first;
                this.second = second;
            }

            public MyPair(EBomber.MyPair other) {
                this.first = other.first;
                this.second = other.second;
            }

            public String toString() {
                //return "[" + first + ", " + second + "]";
                return first + ";" + second;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                EBomber.MyPair myPair = (EBomber.MyPair) o;
                return first == myPair.first &&
                        second == myPair.second;
            }

            public int hashCode() {
                return Objects.hash(first, second);
            }

            public int compareTo(EBomber.MyPair p2) {
                int res = Long.compare(first, p2.first);
                return res != 0 ? res : Long.compare(second, p2.second);
            }

        }

        private static class Forest {
            List<EBomber.Vertex> roots;

            public Forest(List<EBomber.Vertex> roots) {
                this.roots = roots;
            }

            public String toString() {
                return stringMeDeb(this);
            }

        }

        private static class Vertex {
            String label;
            EBomber.Vertex father;
            List<EBomber.Vertex> children;
            public Integer cellMinLength;

            public String toString() {
                return label;
            }

            private void setCellMinLength() {
                setCellMinLength(this);
            }

            private void setCellMinLength(EBomber.Vertex vertex) {
                int ans = 0;
                int cellLength = getCellMinLengthLeave(vertex);
                if (vertex.children != null) {
                    for (EBomber.Vertex next : vertex.children) {
                        setCellMinLength(next);
                        ans += next.cellMinLength;
                    }
                    ans += vertex.children.size() - 1;

                    if (cellLength > ans) {
                        EBomber.Vertex lastChild = vertex.children.get(vertex.children.size() - 1);
                        lastChild.cellMinLength += cellLength - ans;
                    }
                }
                vertex.cellMinLength = Math.max(cellLength, ans);
            }

            private int getCellMinLengthLeave(EBomber.Vertex vertex) {
                return vertex.toString().length();
            }

        }

    }

    static class FastReader {
        public BufferedReader br;
        public StringTokenizer st;
        String context = null;

        public FastReader(InputStream in) {
            this(new InputStreamReader(in));
        }

        public FastReader(InputStreamReader input) {
            br = new BufferedReader(input);
        }

        public String next() {
            if (context != null) {
                System.err.print("[" + context + "] Wait for input ...");
            }
            while (st == null || !st.hasMoreElements()) {
                try {
                    String s = br.readLine();
                    if (s == null)
                        return null;
                    st = new StringTokenizer(s);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("Could not read");
                }
            }
            String res = st.nextToken();
            if (context != null) {
                System.err.println("[" + context + "] ... received : " + res);
            }
            return res;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

