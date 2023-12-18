import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        int mini=200001;
        for(int i=0;i<n;i++){
            int p=sc.nextInt();
            if(mini>=p)count++;
            mini=(int)Math.min(p,mini);
        }
        System.out.println(count);
    }
}