import java.util.*;
import java.io.*;


public class Main{

    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
            char[] arr = in.next().toCharArray();

            if(arr.length == 26) {
                int[] cnt = new int[26];
                for(char c : arr) {
                    ++cnt[c - 'a'];
                }

                int ans = -1;
                int i = arr.length - 1;
                for(i = arr.length - 1; i >= 0; --i) {
                    //System.err.println(">" +i);
                    for(int j = arr[i] - 'a' + 1; j < 26; ++j) {
                       // System.err.println(">>" +j);
                        if(cnt[j] == 0) {
                            ans = j;
                            break;
                        }
                    }
                    
                    if(ans != -1) break;
                    --cnt[arr[i] - 'a'];
                }

                if(ans == -1) {
                    System.out.println(-1);
                } else {
                    for(int j = 0; j < i; ++j) {
                        System.out.print(arr[j]);
                    }

                    System.out.println((char) ('a' + ans));
                }
            } else {
                int[] cnt = new int[26];
                for(char c : arr) {
                    ++cnt[c - 'a'];
                }

                System.out.print(new String(arr));
                for(int i = 0; i < 26; ++i) {
                    if(cnt[i] == 0) {
                        System.out.println((char) ('a' + i));
                        break;
                    }
                }
            }
    }
}