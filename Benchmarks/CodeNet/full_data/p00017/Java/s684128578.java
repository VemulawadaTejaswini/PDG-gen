import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String dataset;
        StringBuilder sb = new StringBuilder("");
        while ((dataset = br.readLine()) != null) {
            char[] arr = dataset.toCharArray();
            while (!isDecoded(arr)) {
                shift(arr);
            }
            sb.append(arr);
            sb.append('\n');
        }

        System.out.println(sb);
    }

    private static char[] shift(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ' && arr[i] != '.') {
                if (arr[i] == 'z') {
                    arr[i] = 'a';
                } else {
                    arr[i]++;
                }
            }
        }
        return arr;
    }

    private static boolean isDecoded(char[] arr) {
        for (int i = 0; i < arr.length - 3; i++) {
            if (arr[i] == 't' && arr[i+1] == 'h') {
                if (arr[i+2] == 'e' ||
                arr[i+2] == 'a' && arr[i+3] == 't' ||
                arr[i+2] == 'i' && arr[i+3] == 's') {
                    return true;
                }
            }
        }
        if (arr[arr.length-3] == 't' && arr[arr.length-2] == 'h' && arr[arr.length-1] == 'e') {
            return true;
        }
        return false;
    }
}