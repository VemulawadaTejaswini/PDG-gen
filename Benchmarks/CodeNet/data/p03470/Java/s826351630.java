import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Main{
	  public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);

		  int N = sc.nextInt();
		  Set<Integer> set = new TreeSet<Integer>();

		  for(int i = 0; i < N; i++) {
			  set.add(sc.nextInt());
		  }
		  System.out.println(set.size());
	  }
}