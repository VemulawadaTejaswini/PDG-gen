import java.util.*;

class Main {
    private static class Field {
        static final int MAX_COORDINATE = 100;
        BitSet[] horizonFieldLines;
        BitSet[] verticalFieldLines;

        private Field() {
            horizonFieldLines  = new BitSet[MAX_COORDINATE + 2];
            for (int i=0; i<horizonFieldLines.length; i++) {
                horizonFieldLines[i] = new BitSet();
            }
        }

        private void addSheet(int x1, int y1, int x2, int y2) {
            for (int i=y1+1; i<=y2; i++) {
                horizonFieldLines[i].set(x1+1, x2+1);
            }
        }

        private void makeInvertedIndex() {
            verticalFieldLines = new BitSet[MAX_COORDINATE + 2];
            for (int i=0; i<verticalFieldLines.length; i++) {
                verticalFieldLines[i] = new BitSet();
            }

            for (int y=0; y<MAX_COORDINATE; y++) {
                for (int x=0; x<horizonFieldLines[y].length(); x++) {
                    if (horizonFieldLines[y].get(x))
                        verticalFieldLines[x].set(y);
                }
            }
        }

        private int measureDimention() {
            int dimention = 0;

            for (BitSet hfLine: horizonFieldLines) {
                dimention += hfLine.cardinality();
            }

            return dimention;
        }

        private int mesureSurroundLength() {
            int surroundLength = 0;

            for (BitSet hfLine: horizonFieldLines) {
                if (hfLine.length() > 0) {
                    BitSet bs = hfLine.get(1, hfLine.length());
                    bs.xor(hfLine);
                    surroundLength += bs.cardinality();
                }
            }

            for (BitSet vfLine:verticalFieldLines) {
                if (vfLine.length() > 0) {
                    BitSet bs = vfLine.get(1, vfLine.length());
                    bs.xor(vfLine);
                    surroundLength += bs.cardinality();
                }
            }

            return surroundLength;
        }
     }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int dataIt=0; dataIt<10; dataIt++) {
            int n = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());
            if (r <= 0) {
                break;
            }

            Field field = new Field();

            for (int sheetIt=0; sheetIt<n; sheetIt++) {
                int x1 = Integer.parseInt(sc.next());
                int y1 = Integer.parseInt(sc.next());
                int x2 = Integer.parseInt(sc.next());
                int y2 = Integer.parseInt(sc.next());
                field.addSheet(x1, y1, x2, y2);
            }

            System.out.println(field.measureDimention());
            if (r == 2) {
                field.makeInvertedIndex();
                System.out.println(field.mesureSurroundLength());
            }
        }
    }
}