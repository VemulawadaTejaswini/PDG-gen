import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int a4 = sc.nextInt();
		int a5 = sc.nextInt();
		int a6 = sc.nextInt();
		int a7 = sc.nextInt();
		int a8 = sc.nextInt();
		int a9 = sc.nextInt();
		
		int[] a= {a1,a2,a3,a4,a5,a6,a7,a8,a9};
	
		int N = sc.nextInt();
		
		Integer b[] = new Integer[N];
		for (int i=0; i<N; i++) {
			b[i] = sc.nextInt();
			for(int j = 0; j<8; j++) {
				if(b[i] == a[j]) {
				a[j] = 0;
				}
				if((a1==0 && a2==0 && a3==0) || (a4==0 && a5==0 && a6==0) ||(a7==0 && a8==0 && a9==0) ||(a1==0 && a4==0 && a7==0) ||(a2==0 && a5==0 && a8==0) ||(a1==3 && a6==0 && a9==0) ||(a1==0 && a5==0 && a9==0) ||(a3==0 && a5==0 && a7==0)) {
					System.out.println("yes");
				}else {
					System.out.println("no");
	}
		
		}

}
	}
}