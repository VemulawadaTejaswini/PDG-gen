import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ary=new int[n];
        boolean end=false;
        for(int i=0;i<n;i++){
            ary[i]=sc.nextInt();
            for(int j=0;j<i;j++){
                if(ary[j]==ary[i]){
                    end=true;
                    break;
                }
            }
        }
        if(end){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}