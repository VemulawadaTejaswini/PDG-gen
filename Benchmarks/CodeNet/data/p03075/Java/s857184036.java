import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int flag = 0;
		for(int i = 0; i < a.length-1; i++) {
			for(int j = i; j < a.length; j++) {
				if(a[i]-a[j] > k || a[j] - a[i] > k) {

					flag++;
				}
			}
		}

		if(flag != 0) {
			System.out.println(":(");
		}else {
			System.out.println("Yay!");
		}
		
	}
}
