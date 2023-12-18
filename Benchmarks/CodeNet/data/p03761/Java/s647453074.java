
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put((char) (97 + i), Integer.MAX_VALUE);
        }
        int n = Integer.parseInt(br.readLine());
        String array[] = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = br.readLine();
        }
        for (int i = 0; i < n; i++) {
            int arr[] = new int[26];
            for (int j = 0; j < array[i].length(); j++) {
                char c = array[i].charAt(j);
                arr[c - 97]++;
            }
            for (int k = 0; k < 26; k++) {
                if (arr[k] < map.get((char) (k + 97))) {
                    map.put((char) (97 + k), arr[k]);
                }
            }
        }
        String s = "";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                int x = entry.getValue();
                char c = entry.getKey();
                for (int i = 0; i < x; i++) {
                    s += c;
                }
            }
        }
        System.out.println(s);
        bw.flush();
    }
}
