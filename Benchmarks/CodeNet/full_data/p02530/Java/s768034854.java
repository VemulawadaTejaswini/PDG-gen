import java.util.Scanner;
import java.lang.String;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int cnt1 = 0;
		int cnt2 = 0;
		
		int n = scan.nextInt();
		
		String str1;
		String str2;
		
		for (int i = 0; i < n; i++){
			str1 = scan.next();
			str2 = scan.next();
			
			if (str1.compareTo(str2) == 0){
				cnt1++;
				cnt2++;
			}
			
			else if (str1.compareTo(str2) > 1){
				cnt1 += 3;
			}
			else {
				cnt2 += 3;
			}
		}
		
		System.out.println(cnt1 + " " + cnt2);
	}
}