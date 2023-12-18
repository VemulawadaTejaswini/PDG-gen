
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int c[][]=new int[3][3];
		int i=0,j=0;
		int temp;
		boolean flag=true;
		for(i=0;i<3;i++)
			for(j=0;j<3;j++){
				temp=stdin.nextInt();
				c[i][j]=temp;
			}
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
//				System.out.println("i="+i+"  j="+j);
				if((c[i][j]-c[i][(j+1)%3])!=
				(c[(i+1)%3][j]-c[(i+1)%3][(j+1)%3]))
					flag=false;
			}
		}
		if(flag)
			System.out.println("Yes");
		else if(!flag)
			System.out.println("No");


	}
}

