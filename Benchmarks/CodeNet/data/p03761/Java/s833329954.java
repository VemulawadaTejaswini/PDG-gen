import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //set the number of strings
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        //get the lexicographically smallest one
        String res = dubiousDocument(arr);
        System.out.println(res);
    }
    private static String dubiousDocument(String[] arr) {
        int[][] map = new int[arr.length][26];
        //find the number of each character in each string
        for (int i = 0; i < arr.length; i++) {
            for (char c : arr[i].toCharArray()) {
                map[i][c - 'a']++;
            }
        }
        int[] minMap = new int[26];
        //find the minimum number of each character
        for (int j = 0; j < 26; j++) {
            minMap[j] = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (map[i][j] == 0) {
                    //if the character is not existed in one of strings, we should skip it
                    minMap[j] = 0;
                    break;
                } else {
                    minMap[j] = Math.min(minMap[j], map[i][j]);
                }
            }
        }
        //convert minMap to string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minMap[i]; j++) {
                sb.append((char)('a' + i));
            }
        }
        return sb.toString();
    }
}
