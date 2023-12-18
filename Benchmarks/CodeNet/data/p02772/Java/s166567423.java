import java.util.Scanner;
//【155】
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n=sc.nextInt();
		int[] numbers =new int[n];
		for (int i=0;i<n;i++) {
			numbers[i] = sc.nextInt();
		}
		boolean isApproved =true;
		for (int i=0;i<n;i++) {
			if (numbers[i]%2==0) {
				if (numbers[i]%3!=0&&numbers[i]%5!=0) {
					isApproved=false;
				}
			}
		}
		if (isApproved) {
			System.out.println("APPROVED");
		} else {
			System.out.println("DENIED");
		}
		
		
//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
	//----------------------------------------
	//置き場
	
	//----------------------------------------
}