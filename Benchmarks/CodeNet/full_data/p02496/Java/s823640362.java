import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] cardnum = new int[4][14];
		int p=0;
		for(int i=0;i<n;i++){
			String g=sc.next();
			int x=sc.nextInt();
			if(g.equals("S"))
				p=0;
			else if(g.equals("H"))
				p=1;
			else if(g.equals("C"))
				p=2;
			else if(g.equals("D"))
				p=3;
			cardnum[p][x]=1;
		}
		for(int i=0;i<4;i++){
			for(int j=1;j<14;j++){
				if(cardnum[i][j] != 1){
					if(i==0)
						System.out.println("S"+j);
					else if(i==1)
						System.out.println("H"+j);
					else if(i==2)
						System.out.println("C"+j);
					else if(i==3)
						System.out.println("D"+j);
				}
			}
		}
	}

}