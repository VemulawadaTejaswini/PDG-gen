import java.util.Scanner;

class HeightsMountains {
	public static void main(String[] args) {
		int[] height = new int[10];
		
		Scanner scanner  = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			height[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < height.length; i++) {
		  for(int j = 0; j < height.length - i - 1; j++) {
		  	if(height[j] > height[j + 1]) {
		  		int temp = height[j];
		  		height[j] = height[j + 1];
		  		height[j + 1] = temp;
		  	}
		  }
		}
		
		for(int i = 9; i > 6; i--) {
			System.out.println(height[i]);
		}
	
	}
}