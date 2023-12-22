 java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int numlength = sc.nextInt();
		int[] numbers = new int[numlength];
		int n = 0;
		int m = 0;
		
		for(int i=0;i<numlength;i++) {
			numbers[i] = sc.nextInt();
		}
		
		for(int i=0;i<numlength;i++) {
			boolean flag1 = true;
			boolean flag2 = true;
			for(int j=0;j<numlength;j++) {
				if(number - i == numbers[j]) {
					flag1 = false;
				}
				if(number + i == numbers[j]) {
					flag2 = false;
				}
			}
			if(flag1 == true && flag2 == true) {
				System.out.println(number - i);
				return;
			}else if(flag1 == true) {
				System.out.println(number - i);
				return;
			}else if(flag2 == true) {
				System.out.println(number + i);
				return;
			}
		}

	}

}
