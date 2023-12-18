import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int cnt=0;
		
		if(s1==1) {
			cnt+=1;
		}
		if(s2==1) {
			cnt+=1;
		}
		if(s3==1) {
			cnt+=1;
		}
		
		System.out.println(cnt);
	}

}
