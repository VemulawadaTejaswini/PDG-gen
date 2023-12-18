import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt(),x=sc.nextInt();
		int left=0,right=0;

		for(int i=0;i<m;i++) {
			int a=sc.nextInt();
			if(a<x) {
				left++;
			}else {
				right++;
			}
		}

		System.out.println(left<right?left:right);



	}
}
