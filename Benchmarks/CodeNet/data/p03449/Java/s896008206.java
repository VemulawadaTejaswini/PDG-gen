import java.util.Scanner;

public class C_87 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x=0,y=0;
		
		int[][] candies = new int[2][N];
		for(int i = 0 ; i < 2 ; i++) 
			for(int k = 0 ; k < N ; k++) 
				candies[i][k] = sc.nextInt();
		int sum=0;
		sum += candies[0][0];
		candies[0][0]=0; 
		while(x != N-1 && y != 1) 
		{	
			if(y==0) 
			{
				if(candies[y][x+1] >= candies[y+1][x])
				{
					x+=1;
					sum += candies[y][x];
					candies[y][x]=0; 
				}
				else if(candies[y][x+1] < candies[y+1][x])
				{
					y+=1;
					sum += candies[y][x];
					candies[y][x]=0;
				}
			}
			
			else if(y==1) 
			{
				if(candies[y][x+1] >= candies[y-1][x])
				{
					x+=1;
					sum += candies[y][x];
					candies[y][x]=0; 
				}
				else if(candies[y][x-1] < candies[y-1][x])
				{
					y-=1;
					sum += candies[y][x];
					candies[y][x]=0;
				}
			}	
		}
		sum+=candies[1][N-1];
		System.out.println(sum);
	}
	


}
