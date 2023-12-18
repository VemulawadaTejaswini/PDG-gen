import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}

		int num = 0;
		int sum = 0;
		int sumb = 0;

		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				sum = 0;
				sumb = 0;
				for(int k=i;k<=j;k++){
					sum += a[k];
					sumb = sumb^a[k];
				}
				if(sum == sumb){
					num += 1;
				}
			}
		}

		System.out.println(num);
	}

}