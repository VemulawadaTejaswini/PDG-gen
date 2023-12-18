import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
long a=scan.nextLong();
long b=scan.nextLong();
long c=scan.nextLong();
double A=(double)a;
double B=(double)b;  
double C=(double)c;  
  
if(2*Math.sqrt(A)*Math.sqrt(B)<C-A-B){
System.out.println("Yes");
}else{
System.out.println("No");  
}
  
  
}
}
