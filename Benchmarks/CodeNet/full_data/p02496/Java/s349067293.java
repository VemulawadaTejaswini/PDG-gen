import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean[][] b=new boolean[4][13];
		int x=sc.nextInt();
		for(int i=0;i<x;i++) {
			String y=sc.next();
			int z=sc.nextInt();
			if("S".equals(y)) b[0][z-1]=true;
			else if("H".equals(y)) b[1][z-1]=true;
			else if("C".equals(y)) b[2][z-1]=true;
			else if("D".equals(y)) b[3][z-1]=true;
		}
		
		for(int j=0;j<4;j++){
			for(int k=0;k<13;k++){
				if(b[j][k]==false){
					if(j==0)System.out.println("S "+(k+1));
					else if(j==1)System.out.println("H "+(k+1));
					else if(j==2)System.out.println("C "+(k+1));
					else if(j==3)System.out.println("D "+(k+1));
				}
			}
		}
		sc.close();
		System.exit(0);
	}
}