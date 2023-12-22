import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] set = new int[30];
        
        int w = sc.nextInt();
        int n = sc.nextInt();
        
        for (int i=0;i<w;i++) set[i] = i+1;
        for (int i=0;i<n;i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int temp = set[a];
            set[a] = set[b];
            set[b] = temp;
        }
        for (int i=0;i<w;i++) {
            System.out.println(set[i]);
        }
    }
}