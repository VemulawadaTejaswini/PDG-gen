import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
//        int test = GetInput.getInt();
////        while (test-- > 0) {
////        }
        StringBuilder stringBuilder = GetInput.getInputString();
        for (int i = 0; i <stringBuilder.length(); i++){
            if (stringBuilder.charAt(i) == '?' && i!=stringBuilder.length()-1){
                if (stringBuilder.charAt(i+1) == 'D'){
                    stringBuilder.setCharAt(i,'P');
                }
                else if (stringBuilder.charAt(i+1) == '?') {
                    stringBuilder.setCharAt(i, 'P');
                    stringBuilder.setCharAt(i+1, 'D');
                }
                else {
                    stringBuilder.setCharAt(i, 'D');
                }
            }
            if (stringBuilder.charAt(i) == '?' && i==stringBuilder.length()-1){
                stringBuilder.setCharAt(i, 'D') ;
            }
        }
        System.out.println(stringBuilder.toString());
    }

//    int t = GetInput.getInt();
//    Timings [] timings = new Timings[t];
//        for (int i = 0 ; i < t; i++){
//        int []array = GetInput.getArrayInt();
//        timings[i] = new Timings(array);
//    }
//
//        Arrays.sort(timings);
//    int maxCount = 0;
//        for (int i = 0 ; i < t; i++){
//        int currCount = 0;
//        for (int j = 0 ; j < i; j++){
//            if (notOverlap(timings[i], timings[j])){
//                currCount++;
//            }
//        }
//        currCount++;
//        if (maxCount<currCount){
//            maxCount = currCount;
//        }
//    }
//        System.out.println(maxCount);

    private static boolean notOverlap(Timings t1, Timings t2){
        return t1.start >= t2.end;
    }

    private static int mod(int b) {
        if (b < 0) {
            return -b;
        }
        return b;
    }

    private static long max(int in, int in1) {
        if (in > in1) {
            return in;
        }
        return in1;
    }

    private static long min(long in, long in1) {
        if (in > in1) {
            return in1;
        }
        return in;
    }

}
 class Timings implements Comparable<Timings> {
    int start;
    int end;
    Timings(int []array){
        start = array[0];
        end = array[1];
    }

     @Override
     public int compareTo(Timings o) {
         return this.end-o.end;
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
