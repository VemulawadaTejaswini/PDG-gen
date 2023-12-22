import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int home[][][] = new int[4][3][10];

		Scanner std = new Scanner(System.in);
		int n = Integer.parseInt(std.next());
		for (int i=1; i<=n; i++){
			int b = Integer.parseInt(std.next());
			int f = Integer.parseInt(std.next());
			int r = Integer.parseInt(std.next());
			int v = Integer.parseInt(std.next());
			home[b-1][f-1][r-1] += v;
		}
		for (int j=0; j<=4-1; j++){
			for(int k=0; k<=3-1; k++){
				String line = "";
				for(int l=0; l<=10-1; l++){
					line += " "+home[j][k][l];
				}
				System.out.println(line);
			}
			if(j!=3){System.out.println("####################");}
		}
	}
}