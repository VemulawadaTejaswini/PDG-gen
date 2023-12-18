import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static long slove(String p,long all){
        char m[]=p.toCharArray();
        for(int k=1;k<=p.length()/2;k++){
            for(int i=0;i<m.length;i++){
                if(i+2*k>=p.length())
                    break;
                else{
                    if(m[i]!=m[i+k]&&m[i+2*k]!=m[i+k]&&m[i]!=m[i+2*k]) {
                        all--;
                    }
                }
            }
        }
        return all;
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
        long all=countB*countG;
        all*=countR;
        System.out.println(Main.slove(p,all));
    }
}
