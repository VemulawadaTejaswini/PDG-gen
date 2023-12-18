import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static long slove(String p){
        long v=0;
        char m[]=p.toCharArray();
        int k=1;
        while(k<=p.length()/2){
            for(int i=0;i<m.length;i++){
                if(i+2*k>=p.length())
                    break;
                else{
                    if(m[i]!=m[i+k]&&m[i+2*k]!=m[i+k]&&m[i]!=m[i+2*k])
                        v++;
                }
            }
            k++;
        }
        return v;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int a=sc.nextInt();
        String p=sc.next();
        int countR=0;
        int countG=0;
        int countB=0;
        char m[]=p.toCharArray();
        for(int i=0;i<m.length;i++){
            if(m[i]=='R')
                countR++;
            if(m[i]=='G')
                countG++;
            if(m[i]=='B')
                countB++;
        }
        long all=countB*countG*countR;
        all-=Main.slove(p);
        System.out.println(all);
    }
}
