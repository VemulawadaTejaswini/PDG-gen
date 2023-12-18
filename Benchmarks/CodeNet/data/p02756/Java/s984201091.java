import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        StringBuffer s=new StringBuffer(sc.next());
        int q=sc.nextInt(),t=0,f=0;
        char c=0;
        int l=s.length();
        boolean direction=true;
        for(int i=0;i<q;i++){
            t=sc.nextInt();
            if(t==1){
                direction=!direction;
            }else{
                f=sc.nextInt();
                c=sc.next().charAt(0);
                if(direction==(f==1)){
                    s.insert(0,c);
                }else{
                    s.insert(l,c);
                }
                l++;
            }
        }
        String str=s.toString();
        for(int i=0;i<l;i++){
            System.out.print(str.charAt(direction?i:l-i-1));
        }
        System.out.println();
    }
}