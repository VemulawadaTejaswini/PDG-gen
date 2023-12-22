import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;char[] c;
        while(true){
            a=sc.nextInt();c=sc.next().toCharArray();b=sc.nextInt();
            if(c[0]=='?')break;
            if(c[0]=='+')System.out.println(a+b);
            else if(c[0]=='-')System.out.println(a-b);
            else if(c[0]=='*')System.out.println(a*b);
            else System.out.println(a/b);
        }
}
}
