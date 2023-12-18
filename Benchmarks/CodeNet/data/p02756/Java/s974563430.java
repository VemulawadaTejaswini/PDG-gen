import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuffer[] frontString=new StringBuffer[2];
        frontString[0]=new StringBuffer("");
        frontString[1]=new StringBuffer("");
        StringBuffer[] backString=new StringBuffer[2];
        backString[0]=new StringBuffer("");
        backString[1]=new StringBuffer("");
        int q=sc.nextInt(),t=0,f=0;
        String c="";
        int fl=0,bl=0;
        boolean direction=true;
        for(int i=0;i<q;i++){
            t=sc.nextInt();
            if(t==1){
                direction=!direction;
            }else{
                f=sc.nextInt();
                c=sc.next();
                if(direction==(f==1)){
                    frontString[0].insert(0,c);
                    frontString[1].insert(fl,c);
                    fl++;
                }else{
                    backString[0].insert(bl,c);
                    backString[1].insert(0,c);
                    bl++;
                }
            }
        }
        if(direction){
            System.out.println(frontString[0].toString() + str + backString[0].toString());
        }else{
            System.out.print(backString[1].toString());
            int l=str.length();
            StringBuffer s=new StringBuffer("");
            for(int i=0;i<l;i++){
                s.insert(i,str.charAt(l-i-1));
            }
            System.out.println(s.toString() + frontString[1].toString());
        }

    }
}