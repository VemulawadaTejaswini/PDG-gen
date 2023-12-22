import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String str;
    int s;
   
   
    str = scan.next();   
    s = str.length();
   for(int i= s-1 ; i>=0 ;i--){
       char c = str.charAt(i);
       System.out.print(c);
   }
   
   System.out.println();
    }
}