import java.util.Scanner;

class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		while(0 < 1) {
		int test[];
		double ave,sum = 0,ans = 0;
		int student = sc.nextInt();
		if(student == 0) break;
		test = new int[student];
		for(int i = 0 ; i < student ; i++) {
			test[i] = sc.nextInt();
			sum += test[i];
		}
		ave = sum / student;
		for(int i = 0 ; i < student ; i++) {
			ans += Math.pow(test[i] - ave, 2);
		}
		ans /= student;
		ans = Math.sqrt(ans);
		System.out.println(ans);
		}
		sc.close();
	}
}
