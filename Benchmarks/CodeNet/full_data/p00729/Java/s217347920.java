import java.util.*;
public class main {
	public static void main(String[] args) {
		int N, M, r, q, t, n, m, s, ts, te, hoge;
		String output = "";
		Scanner scan = new Scanner(System.in);
		
		for(int set = 0; set < 10; set++){
			int pc_count = scan.nextInt();//N
			int student_count = scan.nextInt();//M
			
			if(pc_count == 0 && student_count == 0){
				break;
			}
			
			int resultimeArray[][] = new int[student_count + 1][1260];
			int tmpArray[][] = new int[student_count + 1][pc_count + 1];
			
			r = scan.nextInt();
			for (int i = 0; i < r; i++){
				t = scan.nextInt();
				n = scan.nextInt();//PC
				m = scan.nextInt();//Student
				s = scan.nextInt();
				if(s==1){
					tmpArray[m][n] = t;
				}else{
					for (int j = tmpArray[m][n] + 1; j <= t; j++){
						resultimeArray[m][j] = 1;
					}
				}
			}
			
			q = scan.nextInt();
			for (int i = 0; i < q; i++){
				te = scan.nextInt();
				ts = scan.nextInt();
				m = scan.nextInt();
				int resultTmp = 0;
				for (int j = te + 1; j <= ts; j++){
					if (resultimeArray[m][j]==1){
						resultTmp++;
					}
				}
				System.out.println(resultTmp);
			}
		}
	}
}