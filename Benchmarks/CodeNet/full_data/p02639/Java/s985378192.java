import java.util.Scanner;

class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[]= new int[5];
		int ret=0;
		for(int i=0;i<5;i++) {
			x[i] = sc.nextInt();
			if(x[i]==0) {
				ret = (i+1);
			}
		}
		System.out.println(ret);
	}
}
