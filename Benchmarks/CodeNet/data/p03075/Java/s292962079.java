import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[6];
		for(int i=0;i<6;i++) {
			a[i]= sc.nextInt();
		}
		boolean s=true;
		for(int i=0;i<5;i++) {
			if(a[5]>Math.abs(a[i])){
				s=false;
				break;
			}
		}
		System.out.println((s)?"Yay!":":(");
	}

}
