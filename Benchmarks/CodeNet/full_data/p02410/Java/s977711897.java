import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		//System.out.print(" ");
		Scanner scan = new Scanner(System.in);
		ArrayList<String> suite = new ArrayList<String>();
		ArrayList<String> hikaku = new ArrayList<String>();
		ArrayList<Integer> lb = new ArrayList<Integer>();
		ArrayList<Integer> lf = new ArrayList<Integer>();
		ArrayList<Integer> lr = new ArrayList<Integer>();
		ArrayList<Integer> lv = new ArrayList<Integer>();
		int n =scan.nextInt();
		int m =scan.nextInt();
		int a[][] = new int[100][100];
		int b[][] = new int[100][100];
		for(int i =0; i<n; i++){
			for(int ii=0;ii<m;ii++){
				a[i][ii] = scan.nextInt();
			}
		}
		
		for(int i=0;i<m;i++){
			b[0][i] = scan.nextInt(); 
		}
		
		for (int i=0; i<n; i++){
			int keisan = 0;
			for(int ii=0; ii<m; ii++){
				keisan += a[i][ii] * b[0][ii];
			}
			System.out.println(keisan);
		}
	}
}