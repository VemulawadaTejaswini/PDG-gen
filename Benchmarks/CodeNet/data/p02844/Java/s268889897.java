import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        sc.close();
        int count=0;
        boolean[][] ary=new boolean[3][10];
        for(int i=0;i<10;i++){
            int ind=s.indexOf(i+'0');
            if(ind>=0&&ind<=n-2){
                for(int j=0;j<10;j++){
                    int jnd=s.indexOf(j+'0',ind+1);
                    if(jnd>=0&&jnd<=n-1){
                        for(int k=0;k<10;k++){
                            if(s.indexOf(k+'0',jnd+1)>=0){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}