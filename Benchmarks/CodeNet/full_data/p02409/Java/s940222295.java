
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int n=cin.nextInt();
		char rooms[][][]=new char[4][3][10];
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<10;k++)rooms[i][j][k]=0;
			}
		}
		
		for(int i=0;i<n;i++) {
			int b=cin.nextInt(),f=cin.nextInt(),r=cin.nextInt(),v=cin.nextInt();
			rooms[b-1][f-1][r-1]+=v;
		}
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<10;k++)System.out.print(" "+(int)rooms[i][j][k]);
				System.out.println();
			}
			if(i!=3)System.out.println("####################");
		}
	}
}
