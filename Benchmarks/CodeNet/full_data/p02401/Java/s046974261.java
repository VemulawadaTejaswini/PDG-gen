import java.util.*;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int a=sc.nextInt();
            String in=sc.next();
            int b=sc.nextInt();
            char op[]=in.toCharArray();
            if(op[0]=='+') System.out.println(a+b);
            else if(op[0]=='-') System.out.println(a-b);
            else if(op[0]=='*') System.out.println(a*b);
            else if(op[0]=='/') System.out.println(a/b);
            else break;
        }
    }
}
