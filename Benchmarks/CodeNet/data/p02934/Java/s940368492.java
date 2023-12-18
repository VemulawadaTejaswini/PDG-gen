import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		int[]arr=new int[N];
		for(int index=0;index<N;index++) {
			arr[index]=scanner.nextInt();
		}
		float sum=0;
		for(int value:arr) {
			sum+=1.0/value;
		}
		System.out.println(1.0*Math.round(100000/sum)/100000);
	}
}