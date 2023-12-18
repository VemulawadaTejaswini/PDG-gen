import java.util.*;

class Main{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int candies[][] = new int[2][num];
		for(int m=0;m<2;m++){
			for(int n=0;n<num;n++){
				candies[m][n] = sc.nextInt();
			}
		}

		int max=0;

		for(int m=0;m<num;m++){
			int c=0;
			int y=0;
			for(int n=0;n<num;n++){
				if(m==n){
					c += candies[y][n];
					y++;
				} 
				c += candies[y][n];
			}
			if(max<c) max = c;
		}

		System.out.println(max);
	}
}