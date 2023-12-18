import java.util.Arrays;
import java.util.Scanner;
class Main{
	   public static void main(String[] args){
	  Scanner scan =  new Scanner(System.in);
	   int a = scan.nextInt();
       int b = scan.nextInt();
       int c = scan.nextInt();
int d = b-a;
int e = c- b;
if (d==e){
System.out.println("Yes");
}else{
System.out.println("No");
}
}
}