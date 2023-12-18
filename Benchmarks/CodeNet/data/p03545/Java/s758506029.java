import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int k=scanner.nextInt();
		int sum=0;
		for (int i = 10000; i <=30000; i++) {
			String s=Integer.toString(i);
			String sub1=s.substring(0, 3);
			String sub2=s.substring(1,4);
			String sub3=s.substring(2);
			int s1=Integer.parseInt(sub1);
			int s2=Integer.parseInt(sub2);
			int s3=Integer.parseInt(sub3);
			if (s1%k==0&&s2%k==0&&s3%k==0) {
				sum++;
				System.out.println(i);
			}
		}
		if (sum==0) {
			System.out.print("No");
		}
	}
}