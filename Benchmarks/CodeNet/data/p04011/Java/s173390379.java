import java.util.*;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();
      int n = a-b;
      int counter =0;
      if(n>0){
      	System.out.println( (b*c)+(n*d));
      }else{
      	System.out.println(a*d);
        
      }
    }
}
