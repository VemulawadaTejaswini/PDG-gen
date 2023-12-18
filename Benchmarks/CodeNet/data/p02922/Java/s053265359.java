import java.util.*;
public class Main {
	public static void main(String args[]) {
     	Scanner scan = new Scanner(System.in);
      	int a = scan.nextInt();
      	int b = scan.nextInt();
      	if(b%a==0) {
          a=b/a;
        }else{
          a=b/a+1;
        }
      System.out.println(a);
    }
}