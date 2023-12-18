import java.util.Scanner;

class Main{
	public static void main(String args[]){
		int x,y,i,j;
		Scanner sc = new Scanner(System.in);

		x = sc.nextInt();
		i = j = 0;

		while(true){
			if (i * j <= x && x > y) y = x;
			else break; 
			j++;
		}
	}
}