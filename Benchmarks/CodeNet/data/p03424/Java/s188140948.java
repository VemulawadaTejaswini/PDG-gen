import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
	  Set<String> hina = new HashSet<>();
	  for(int i = 0; i < N; i++) {
		  hina.add(sc.next());
	  }
	  String ans = "Three";
	  if(hina.size() == 4) {
		  ans = "Four";
	  }
	  System.out.println(ans);
	}
}