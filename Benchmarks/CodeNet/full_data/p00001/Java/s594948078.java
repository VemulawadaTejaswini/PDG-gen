import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner stdIn = new Scanner(System.in);
		int[] height = new int[10];
		int[] max = new int[3];
		
		for (int i = 0; i < 10; i++){
			height[i] = stdIn.nextInt();
			if (i == 0){
				max[0] = height[i];
			}
			else {
				for (int j = 0; j < 3; j++){
					if (max[j] < height[i]){
						for (int k = 2; k > j; k--){
							max[k] = max[k - 1];
						}
						max[j] = height[i];
						break;
					}
				}
			}
		}
		for (int i = 0; i < 3; i++){
			System.out.println(max[i]);
		}
	}
}