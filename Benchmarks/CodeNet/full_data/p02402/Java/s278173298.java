import java.util.Scanner;

public class Main{

	static int min(int[] a){
		int minValue=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]<minValue){
				minValue=a[i];
			}
		}
		return minValue;
	}

	static int max(int[] a){
		int maxValue=a[0];
		for(int i=1;i<a.length;i++){
			if(maxValue<a[i]){
				maxValue=a[i];
			}
		}
		return maxValue;
	}
	static int sum(int[] a){
		int sumValue=0;
		for(int i=0;i<a.length;i++){
			sumValue+=a[i];
		}
		return sumValue;
	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);

		int n=scan.nextInt();

		if(0<n){
			int[] a=new int[n];


			for(int i=0;i<n;i++){
				a[i]=scan.nextInt();
			}

			System.out.printf("%d %d %d\n",min(a),max(a),sum(a));
		}

		scan.close();
	}
}