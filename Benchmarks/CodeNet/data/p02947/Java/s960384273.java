import java.util.Arrays;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 String [] s = new String [N];

		 for(int i=0;i<N;i++) {
			 s[i] = scan.next();
		 }
		 scan.close();
		 long c=0;

		 for(int i=0;i<N-1;i++) {
			 for(int j=i+1;j<N;j++) {

				 char[] tmp = s[i].toCharArray();
				 char[] tmp2 = s[j].toCharArray();
				 Arrays.parallelSort(tmp);
				 Arrays.parallelSort(tmp2);

				  String ans = String.valueOf(tmp);
				  String ans2 = String.valueOf(tmp2);
				  if(ans.equals(ans2)) {
					  c++;
				  }
			 }
		 }
		 System.out.println(c);
	}


}