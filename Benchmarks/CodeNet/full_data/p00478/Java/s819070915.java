import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		  try(Scanner sc = new Scanner(System.in)) {
				  String str=sc.next();
				  int d=str.length();
				  int n=sc.nextInt();
				  int count=0, sum=0;
				  for(int i=0; i<n; i++) {
					  count=0;
					  String s=sc.next();
					  s+=s;
					  //System.out.println(s);
					  for(int j=0; j<s.length()-d+1; j++) {
						  String s1=s.substring(j, j+d);
						  //System.out.println(s1);
						  if(s1.equals(str)) {
							  count=1;
						  }
					  }
					  //System.out.println(count);
					  sum+=count;
				  }
				  System.out.println(sum);
		}
	}
}
