import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		  try(Scanner sc = new Scanner(System.in)) {
			  while(sc.hasNext()) {
				  String str=sc.nextLine();
				  String ans="";
				  for(int i=0; i<str.length(); i++) {
					  char c=(char)((str.charAt(i)-'A'+23)%26+'A');
					  ans += String.valueOf(c);
				  }
				  System.out.println(ans);
			  }
		  }
	}
}

