import java.util.*;

class main{
	public static void main(String[] args) {
		Scanner[] h = new Scanner[11];
		int[] height = new int[11];

		int i,j;

		for(i=0; i<10; i++){
			h[i] = new Scanner(System.in);
			height[i] = h[i].nextInt();
		}

		for(i=0; i<3; i++){
			for(j=i+1; j<10; j++){
				if(height[i] < height[j]){
					height[10] = height[i];
					height[i] = height[j];
					height[j] = height[10];
				}
			}
			System.out.println(height[i]);
		}

	}

}