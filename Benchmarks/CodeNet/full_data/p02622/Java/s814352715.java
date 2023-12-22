import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   String s=kbd.next();
   String t=kbd.next();
   int x=0;
    for(int i=0;i<s.length();i++){
   if(s.charAt(i)!=t.charAt(i)){
     x++;
   }
 }
 System.out.println(x);
 }
}
