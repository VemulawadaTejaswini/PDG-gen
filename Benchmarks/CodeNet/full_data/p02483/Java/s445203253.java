import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a>b){
          int x=a;
           a = b;
           b = x;
           
        }else if(a>c){
          int x = a;
          a = c;  
          c = x;
        }else if(b>c){
          int x = b;
          b = c;
          c = b;
        }
????????????System.out.println(a+b+c);

 }
}
       