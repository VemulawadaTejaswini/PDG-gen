import java.util.*;

public class Main{
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int a = sc.nextInt();
	  int b = sc.nextInt();
	  sc.nextLine();
	  String str = sc.nextLine();
	  char[] c = str.toCharArray();
	  if(c[b-1] == 'A') {
		  c[b-1] = 'a';
	  }
	  else if(c[b-1] == 'B') {
		  c[b-1] = 'b';
	  }
	  else {
		  c[b-1] = 'c';
	  }
	  for(int i=0; i<c.length; i++) {
		  System.out.print(c[i]);
	  }
  }
}