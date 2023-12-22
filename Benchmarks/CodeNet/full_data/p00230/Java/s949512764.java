import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c[][] = new int[2][100];
		int x = 0;
		int i = 0;
		int n = sc.nextInt();
		int count[] = {0,0};


		while(n != 0){
			for(i=0; i<n; i++)
				c[0][i] = sc.nextInt();
			for(i=0; i<n; i++)
				c[1][i] = sc.nextInt();

			count[0] = 0;
			count[1] = 0;


			x = 0; //a or b
			i = 0; //&#65533;K&#65533;w

			while(i < n-1 || c[x][i]==2 || c[x][i]==3)
			{
				if(c[x][i]==1 && c[x][i+1]==1)
					i++;
				else if(c[x][i]==1 || c[x][i]==0){
					count[0]++;

						i = i+2;

					if(x==0) x=1;
					else x=0;
				}
				else if(c[x][i]==2){
					c[x][i]=3;
					i--;

				}
				else if(c[x][i]==3){
					count[0] = 1000;
					break;
				}
			}

//ツ渉可甘コツ可サ
			for(x=0;x<2;x++)
			for(i=0;i<n-1;i++){
				if(c[x][i]==3)
					c[x][i]=2;
			}

			x = 1; //a or b
			i = 0; //&#65533;K&#65533;w

			while(i < n-1 || c[x][i]==2 || c[x][i]==3)
			{
				if(c[x][i]==1 && c[x][i+1]==1)
					i++;
				else if(c[x][i]==1 || c[x][i]==0){
					count[1]++;

					i = i+2;


					if(x==0) x=1;
					else x=0;
				}
				else if(c[x][i]==2){
					c[x][i]=3;
					i--;
				}

				else if(c[x][i]==3){
					count[1] = 1000;
					break;
				}
			}

			if(count[0]<count[1])
				if(count[0] != 1000){
					System.out.println(count[0]);
					System.out.println("count1="+count[1]);
				}
				else
					System.out.println("NA");

			else
				if(count[1] != 1000){
					System.out.println(count[1]);
					System.out.println("count0="+count[0]);
				}
				else
					System.out.println("NA");

			n = sc.nextInt();
		}
	}
}