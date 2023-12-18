import java.util.Scanner;

/**
 *
 * @author ahaah
 */
public class Tester {

  
   public static void main(String[] args) {
     // System.out.println(new Tester().message());
Scanner in =new Scanner(System.in);
byte n1=in.nextByte();
byte n2=in.nextByte();
if ((n1>0&&n1<=9)&&(n2>0&&n2<=9)){
 System.out.println(n1*n2);
}
else {
 System.out.println("-1");

}
   
  
   }