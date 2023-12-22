import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int l=kbd.nextInt();
   int r=kbd.nextInt();
    int d=kbd.nextInt();
    int a=l/d;
    int b=r/d;
    System.out.println(b-a);

 }

}