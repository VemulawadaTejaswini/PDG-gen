import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[3];
        a[0] = in.nextInt();
        a[1] = in.nextInt();
        a[2] = in.nextInt();
        in.nextLine();
        String[] s = new String[n];
        char[] out = new char[n];
        for(int i = 0; i < n; i++)
            s[i] = in.nextLine();
    

        for(int k = 0; k < n; k++){
            int i = (int)s[k].charAt(0)-(int)'A';
            int j= (int)s[k].charAt(1)-(int)'A';

            if(a[i] > a[j]){
                a[i]--;
                a[j]++;
                out[k] = (s[k].charAt(1));
            }
            else if(a[i] < a[j]){
                a[i]++;
                a[j]--;
                out[k] = (s[k].charAt(0));
            }
            else{
                if(a[i] + a[j] == 0){
                    System.out.println("No");
                    return;
                }
                if(k == n-1 || s[k+1].charAt(0) == s[k].charAt(0) || s[k+1].charAt(1) == s[k].charAt(0)){
                    a[i]++;
                    a[j]--;
                    out[k] = (s[k].charAt(0));
                }
                else{
                    a[i]--;
                    a[j]++;
                    out[k] = (s[k].charAt(1));
                }
            }
        }
        System.out.println("Yes");
        for(int i = 0; i < n; i++)
            System.out.println(out[i]);
    }
}