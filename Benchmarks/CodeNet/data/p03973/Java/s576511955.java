import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    ArrayList<Integer>[] graph;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        long ans = a[0]-1;
        int max = 1;
        for(int i=1;i<n;i++){
            if(a[i]<=max+1) max=Math.max(max,a[i]);
            else{
                ans += (a[i]-1)/(max+1);
            }
        }
        System.out.println(ans);
    }
}
