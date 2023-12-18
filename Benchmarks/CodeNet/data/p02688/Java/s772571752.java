import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		//int d = scan.nextInt();

		int count =0;
		int a[] = new int[k];

		for(int i=0; i<k; i++){
			a[i] = scan.nextInt();

			int aa[] = new int[a[i]];
			for(int j=0; j<a[i]; j++){
				aa[j] = scan.nextInt();
			}
			if(count< a[i]){
				count = a[i];
			}
		}

		System.out.println(n-count);
		scan.close();
	}

}