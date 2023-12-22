import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a=new int[101];
		while(sc.hasNextInt()){
			int b=sc.nextInt();

			a[b]++;
		}

		int max=0;
		for(int i=1; i<=100; i++){
			if(a[i]>=max){
				max=a[i];

			}
		}
		for(int i=1; i<=100; i++){
			if(a[i]==max){
				System.out.println(i);
			}
		}
	}

}

