import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		sc.close();
		int Takahp = A;
		int Aokihp = C;
		int i = 0;
		while (i < 100 || Takahp <= 0 || Aokihp <= 0){
			Aokihp -= B;
			Takahp -= D;
			if(Aokihp <= 0) {
				System.out.println("Yes");
				break;
			}else if(Takahp == 0) {
				System.out.println("No");
				break;
			}else {
				i++;
			}
		}
		
	}
}