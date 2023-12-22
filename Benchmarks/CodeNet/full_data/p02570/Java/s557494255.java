import java.util.Scanner;

public class Main{
public static void main(String[]  args){
 Scanner stdIn = new Scanner(System.in);
 
 int d = stdIn.nextInt();
 int t = stdIn.nextInt();
 int s = stdIn.nextInt();

if ((double)d/s<=t){System.out.print("Yes");}
else if ((double)d/s>t) {System.out.print("No");}

  }
}
