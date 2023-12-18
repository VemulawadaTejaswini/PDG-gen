import java.util.Scanner;

public class ahmednasser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int A = sc.nextInt();
		for(int i=1;H>0;i++) {
			H-=A;
			if(H<=0) {
				System.out.println(i);
			}
		}
	}

}
