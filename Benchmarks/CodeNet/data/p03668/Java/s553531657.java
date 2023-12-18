import java.util.Scanner;
public class Program
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		n--;
		int a[][] = new int[2][n];
		for(int i = 0;i < n;i++){
		    for(int j = 0;j < 2;j++){
		        a[j][i] = sc.nextInt();
		    }
		}
		sc.close();
		int counter = 0;
		int counter_ = 0;
		for(int j = 0;j < n;j++){
			if(a[0][j] == 1 || a[1][j]==1){counter++;}
			else {counter_++;}
		}
		if(counter == 1){System.out.println("Alice");}
		else if ((counter % 2 == 1 && counter_ % 2 == 0)||(counter % 2 == 0 && counter_ % 2 == 1)){System.out.println("Alice");}
		else {System.out.println("Bob");}
	}
}