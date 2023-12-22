import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		  try(Scanner sc = new Scanner(System.in)) {
			  int count=0;
			  while(sc.hasNext()) {
				  String str=sc.nextLine();
				  boolean tf=true;
				  for(int i=0; i<str.length(); i++) {
					  if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
						  tf=false;
					  }
				  }
				  if(tf) count++;
			  }
			  System.out.println(count);
		  }
	}
}
