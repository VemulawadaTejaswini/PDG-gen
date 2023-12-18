import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] num = new int[N];
		int add=0;
		for (int i=0;i<N ;i++ ) {
			num[i]=scan.nextInt();
			add+=num[i];
		}

		double hei = (double)add/N;

		double min = 200;
		int mem = 0;
		double mai = 0;
		for (int i=0;i<N ;i++ ) {
			mai = hei-num[i];
			if(mai<0){mai*=-1;}
			if(mai<min){
				min=mai;
				mem=i;
			}
		}
		System.out.println(num[mem]);

	}
}