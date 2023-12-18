import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n =  sc.nextInt();
		int a[] = new int[n];
		for(int i = 0;i < n;i++){
			a[sc.nextInt()]++;
		}

		for(int i = 0;i < n;i++){
			if(n%2 == 0){
				if(i%2 != 0 && a[i] != 2){
					System.out.println(0);
					return;
				}
			}else{
				if(i == 0){
					if(a[i] != 1){
						System.out.println(0);
						return;
					}
				}else if(i%2 == 0 && a[i] != 2){
					System.out.println(0);
					return;
				}
			}
		}

		System.out.println((int)Math.pow(2, (int)(n/2)));
	}
}