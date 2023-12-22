import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int min = 0, max = 0;
		long sum = 0;
		Scanner scan = new Scanner(System.in);
		//while(scan.hasNext()){
			int n = scan.nextInt();
			int a[] = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = scan.nextInt();
				if(i == 0){
					min = a[0];
					max = a[0];
				}else{
					if(a[i] < min){
						min  = a[i];
					}
					if(max < a[i]){
						max = a[i];
					}
				}
				sum += a[i];
			}
		//}
		System.out.println(min + " " + max + " " + sum);

	}
}