import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=a/100;
        int c=a%100/10;
        int d=a%1000/1;
        if(b==c&&c==d)
            System.out.println(a);
        else
            System.out.println(((b+1)*100)+(b+1)*10+b+1);
     }
}