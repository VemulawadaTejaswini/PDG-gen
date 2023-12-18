import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   ArrayList<Integer>al = new ArrayList<Integer>();
		   
		   int n = sc.nextInt();
		   int m = sc.nextInt();
		   
		   for(int i = 0; i < n ;i++) {
			   int p = sc.nextInt();
			   al.add(p);
		   }
		   
		   for(int i = 0 ; i < m ; i++) {
			int a = Collections.max(al);
			int b =(int) Math.floor(a/2);
			al.remove(al.indexOf(a));
			al.add(b);
		   }
		   
		   long sum = 0;
		   
		   for(int i = 0 ; i < n ;i++) {
			   sum += al.get(i);
		   }
		   System.out.println(sum);

	}

}
