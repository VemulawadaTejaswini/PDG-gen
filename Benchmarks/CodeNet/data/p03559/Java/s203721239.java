import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n;
        long[] Ai;
        long[] Bi;
        long[] Ci;

        try (InputScanner is = new InputScanner(System.in)) {
            n = is.ni();
            Ai = is.nla(n);
            Bi = is.nla(n);
            Ci = is.nla(n);
        }

        Arrays.sort(Ai);
        Arrays.sort(Bi);
        Arrays.sort(Ci);

        long result = 0;
        for(long b :Bi){
            //AiでB未満が何個あるか
            int a = countLower(Ai,b);

            //CiでB超過が何個あるか
            int c = countHigher(Ci,b);

            result += a*c;
        }


        System.out.println(result);
    }

    private static int countLower(long[] array, long maxVal){
        if(array[array.length-1] < maxVal){
            return array.length;
        }
        int begin = 0;
        int end = array.length -1;
        while(begin <= end) {
            int mid = (begin + end) >>> 1;
            long midValue1 = array[mid];
            long midValue2 = array[mid+ 1] ;
            if (midValue1 < maxVal && maxVal <= midValue2) {
                return mid + 1;
            } else {
                if (midValue1 >= maxVal) {
                    end = mid -1;
                } else if (maxVal > midValue2) {
                    begin = mid+1;
                }
            }
        }
        return 0;
    }
    private static int countHigher(long[] array, long minVal){
        if(array[0] > minVal){
            return array.length;
        }
        int begin = 0;
        int end = array.length -1;
        while(begin <= end) {
            int mid = (begin + end) >>> 1;
            long midValue1 = array[mid];
            long midValue2 = array[mid+ 1];
            if (midValue1 <= minVal && minVal < midValue2) {
                return array.length -(mid + 1);
            } else {
                if (midValue1 > minVal) {
                    end = mid -1;
                } else if (minVal >= midValue2) {
                    begin = mid+1;
                }
            }
        }
        return 0;
    }

    //-------------------------------------------------------------------
    public static class InputScanner implements Closeable {
        private final BufferedReader br;
        private String[] element;
        private int elementIndex;

        public InputScanner(InputStream is) {
            this.br = new BufferedReader(new InputStreamReader(is));
        }

        public String next() {
            return this.nextElement();
        }

        //next int
        public int ni() {
            return Integer.parseInt(this.nextElement());
        }

        //next long
        public long li() {
            return Long.parseLong(this.nextElement());
        }

        //next int array
        public int[] nia(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = this.ni();
            }
            return arr;
        }

        //next int array
        public long[] nla(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = this.ni();
            }
            return arr;
        }
        private void readLine() {
            try {
                this.element = this.br.readLine().split("\\s");
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.elementIndex = 0;
        }

        private String nextElement() {
            if (!hasElement()) {
                this.readLine();
            }
            return this.element[this.elementIndex++];
        }

        private boolean hasElement() {
            return this.element != null && this.element.length > this.elementIndex;
        }

        @Override
        public void close() {
            if (this.br != null) {
                try {
                    this.br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
//-------------------------------------------------------------------
}
