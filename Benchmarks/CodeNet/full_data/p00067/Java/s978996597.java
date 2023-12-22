import java.util.Scanner;

public class Main {
	
	static int[][] area = new int[12][12];
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			int count = 0;

			for(int i = 0;i < area.length; i++) {
				char[] nums = sc.nextLine().toCharArray();
				for(int j = 0;j < area.length; j++) {
					area[i][j] = Character.getNumericValue(nums[j]);
				}

			}

			for(int i = 0;i < area.length; i++) {
				for(int j = 0;j < area.length; j++) {
					if(area[i][j] == 1) {
						count++;
						checkIsland(area,i,j);
					}
				}
			}
			System.out.println(count);
			sc.nextLine();
		}
		
		
	}
	
	public static void checkIsland(int[][] area,int i,int j) {
		area[i][j] = 0;
		if(j < 11) {
			if(area[i][j + 1] == 1) {
				checkIsland(area,i,j + 1);
				
			}
		}
		if(i < 11) {
			if(area[i + 1][j] == 1) {
				checkIsland(area,i + 1,j);
				
			}
		}
		if(j > 0) {
			if(area[i][j - 1] == 1) {
				checkIsland(area,i, j - 1);
				
			}
		}
		if(i > 0) {
			if(area[i - 1][j] == 1) {
				checkIsland(area,i - 1,j);
				
			}
		}
		
	}

}