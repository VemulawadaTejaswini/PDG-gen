import java.util.Scanner;

class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		int num[];
		int nagasa = sc.nextInt();
		num = new int[nagasa];
		for(int i = 0; i < nagasa ; i++) {
			num[i] = sc.nextInt();
		}
		for(int j = nagasa - 1; j >= 0 ; j--) {
			System.out.printf("%d", num[j]);
			if(j != 0) System.out.printf(" ");
		}
		System.out.printf("\n");
		sc.close();
	}	
}
