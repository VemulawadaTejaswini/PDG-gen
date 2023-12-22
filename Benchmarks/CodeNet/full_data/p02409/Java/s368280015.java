import java.util.Scanner;

//20180509
//01

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();
		int[][] nums = new int[3*4][10];

		for(int i = 0;i < count;i++) {
			int b =  scanner.nextInt();
			int f =  scanner.nextInt();
			int r = scanner.nextInt();
			int v = scanner.nextInt();

			if(b < 3) {
				f *= 1;
			} else if(b >= 3 && b < 6) {
				f *= 2;
			} else if(b >= 6 && b > 9) {
				f *= 3;
			} else {
				f *= 4;
			}

			nums[f][r] = v;
		}
		scanner.close();
		for(int y = 0;y < 12;y++) {
			for(int x = 0;x < 10;x++) {
				System.out.printf(" %d",nums[y][x]);
			}
		}
		for(int y = 0;y < 12;y++) {
			for(int x = 0;x < 10;x++) {
				System.out.printf(" %d",nums[y][x]);
			}
			System.out.println();
			if((y + 1) % 3 == 0 && (y + 1) != 12) {
				for(int i= 0;i < 20;i++) {
					System.out.print("#");
				}
				System.out.println();
			}
		}
    }
}
