import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        int num = GetInput.getInt();
//        long count = 0;
//        for (int i = 1; i <= num; i++){
//            for (int j =1 ; j <= num; j++){
//                for (int k = 1; k <= num; k++){
//                    count += gcd(i, gcd(j, k));
//                }
//            }
//        }
//        System.out.println(count);

        int length = GetInput.getInt();
        char [] str = GetInput.getCharArray();
        ArrayList<Integer> posR = new ArrayList<>();
        ArrayList<Integer> posG = new ArrayList<>();
        ArrayList<Integer> posB = new ArrayList<>();

//        for (int i = 0; i < length; i++){
//            if (str[i] == 'R'){
//                posR.add(i);
//                continue;
//            }
//            if (str[i] == 'G'){
//                posG.add(i);
//                continue;
//            }
//            if (str[i] == 'B'){
//                posB.add(i);
//                continue;
//            }
//        }
//
//        for (int i = 0; i < length; i++){
//            if (posR.contains(i)){
//                if (posB)
//            }
//        }
        int count = 0;
        for (int i = 0 ;i < length; i++){
            for (int j = i+1 ; j<length; j ++){
                if (str[j] == str[i]){
                    continue;
                }
                for (int k = j+1; k<length; k++){
                    if (str[i] != str[k] && str[k] != str[j]){
                        if (j-i != k-j){
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }

//    static int gcd(int a, int b){
//        if (b==0){
//            return a;
//        }
//        else return gcd(b, a%b);
//    }
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
