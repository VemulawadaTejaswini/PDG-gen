import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];

		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}

		int buff = array[n-1];
		int count=0;

		for(int i=n-2;i>=0;i--) {
			if(array[i] == buff-1) {
				buff = array[i];
			}else {
				count++;
			}
		}

		int buff2 = array[0];
		int count2=0;

		for(int i=1;i<n;i++) {
			if(array[i] == buff2+1) {
				buff2 = array[i];
			}else {
				count2++;
			}
		}
		if(buff2 == n-count2 && buff==1) {
			if(count<=count2) {
				if(buff == 1) {
					System.out.println(count);
				}else {
					System.out.println(-1);
				}
			}else {
				if(buff2 == n-count2) {
					System.out.println(count2);
				}else {
					System.out.println(-1);
				}
			}
		}else if(buff==1){
			System.out.println(count);
		}else if(buff2==n-count2) {
			System.out.println(count2);
		}else {
			System.out.println(-1);
		}




	}
}


