import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] ary=new int[n];
        for(int i=0;i<n;i++)ary[i]=sc.nextInt();
        sc.close();

        Arrays.sort(ary);
        for(int i=0;i<n;i++){
            if(ary[i]>=k){
                System.out.println(n-i);
                System.exit(0);
            }
        }
        System.out.println("0");
    }
}