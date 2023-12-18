import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;

class Main {
    public static void main(String args[] ) throws Exception {

        int []ins = GetInput.getArrayInt();
        int n = ins[0]; int k = ins [1];
//        if (k > n/2) {
//            if (k >= n) {
//                System.out.println(1);
//                return;
//            }
//            BigInteger possible = BigInteger.ZERO;
//            if (k <= 2) {
//                possible = possible.subtract(BigInteger.valueOf((n+1)/4));
////                System.out.println(possible);
//            }
//            for (int i = k; i<=n+1;i++){
//                possible = possible.add(binomial(n+1,i));
////                System.out.println(possible+" "+binomial(n+1,k)+" "+(n+1)+" "+i);
//            }
//            System.out.println(possible.toString());
//            return;
//        }

        BigInteger possible = BigInteger.valueOf((long)Math.pow(2, n+1));
        if (k <= 2) {
            possible = possible.subtract(BigInteger.valueOf((n+1)/4));
        }
        for (int i = 0; i<k;i++){
            possible = possible.subtract(binomial(n+1,i));
        }
        System.out.println(possible.toString());
        return;
    }
    static BigInteger binomial( int N,  int K) {
        BigInteger ret = BigInteger.ONE;
        for (int k = 0; k < K; k++) {
            ret = ret.multiply(BigInteger.valueOf(N-k))
                    .divide(BigInteger.valueOf(k+1));
        }
        return ret.mod(BigInteger.valueOf((long)Math.pow(10,9)+7));
    }

}

class GetInput {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    static char[] getCharArray() {
        char[] charArray;
        try {
            StringBuilder string = getInputString();
            charArray = new char[string.length()];
            for (int i = 0; i < string.length(); i++) {
                charArray[i] = string.charAt(i);
            }
            return charArray;
        } catch (Exception e) {
            e.printStackTrace();
        }
        charArray = new char[0];
        return charArray;
    }

    static int[] getArrayInt() {
        String[] string;
        int[] array;
        try {
            string = bufferedReader.readLine().split("\\s+");
            array = new int[string.length];
            for (int i = 0; i < string.length; i++) {
                array[i] = Integer.parseInt(string[i]);
            }
            return array;
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[] arra = new int[2];
        return arra;
    }

    static int getInt() {
        try {
            String string = bufferedReader.readLine();
            return Integer.parseInt(string);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }

    static StringBuilder getInputString() {
        try {
            StringBuilder string = new StringBuilder();
            string.append(bufferedReader.readLine());
            return string;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new StringBuilder();
    }

    static long getLongInput() {
        try {
            String string = bufferedReader.readLine();
            return Long.parseLong(string);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }

    static long[] getLongArrayInput() {
        String[] string;
        long[] array;
        try {
            string = bufferedReader.readLine().split("\\s+");
            array = new long[string.length];
            for (int i = 0; i < string.length; i++) {
                array[i] = Long.parseLong(string[i]);
            }
            return array;
        } catch (IOException e) {
            e.printStackTrace();
        }

        long[] arra = new long[2];
        return arra;
    }
}

