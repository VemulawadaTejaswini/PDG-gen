import java.util.Scanner;

//20180509
//01

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();
		int[][][] nums = new int[4][3][10];

		for(int i = 0;i < count;i++) {
			int b =  scanner.nextInt();
			int f =  scanner.nextInt();
			int r = scanner.nextInt();
			int v = scanner.nextInt();

			nums[b-1][f-1][r-1] = v;
		}
		scanner.close();
		for(int z = 0;z < 4;z++) {
			for(int y = 0;y < 3;y++) {
				for(int x = 0;x < 10;x++) {
					System.out.printf(" %d",nums[z][y][x]);
				}
				System.out.println();
			}
			if(z != 3) {
				for(int i= 0;i < 20;i++) {
					System.out.print("#");
				}
				System.out.println();
			}
		}
    }
}
