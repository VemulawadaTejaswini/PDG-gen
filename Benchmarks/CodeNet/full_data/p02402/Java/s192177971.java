import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();

		long min = 0,max = 0,sum=0;
		for(int i=0;i<n;i++) {
			int q=scan.nextInt();
			if(i==0) {
				min=q;
				max=q;
			}
			if(min>q)min=q;
			if(max<q)max=q;
			sum+=q;
		}
		System.out.println(min+" "+max+" "+sum);
		scan.close();
	}

}
