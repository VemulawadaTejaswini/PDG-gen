import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int m = scan.nextInt();
			int n = scan.nextInt();
			if(m == 0 && n == 0){
				break;
			}
			int max = 0;
			int t = 0;
			for(int i = 0;i < m;i++){
				t = 0;
				for(int j = 0;j < n;j++){
					t += (scan.nextInt() == 1)?1:0;
				}
				if(max < t){
					max = t;
				}
			}
			System.out.println(max);
		}
	}
}