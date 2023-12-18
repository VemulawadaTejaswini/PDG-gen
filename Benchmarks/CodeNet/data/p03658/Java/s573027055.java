import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), k=sc.nextInt();
        int[] l=new int[n];
        for(int i=0;i<n;i++){
            l[i]=sc.nextInt();
        }
        sc.close();
        Arrays.sort(l);
        int len=0;
        for(int i=0;i<k;i++){
            len+=l[n-i-1];
        }
        System.out.println(len);
    }
    
}
