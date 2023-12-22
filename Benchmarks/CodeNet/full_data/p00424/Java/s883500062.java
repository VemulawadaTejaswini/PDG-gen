import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			String[][] cv = new String[n][2];
			for(int i=0;i<n;i++){
				cv[i][0] = stdIn.next();
				cv[i][1] = stdIn.next();
			}
			int m = stdIn.nextInt();
			for(int i=0;i<m;i++){
				String x = stdIn.next();
				boolean flag = true;
				for(int j=0;j<n;j++){
					if(x.equals(cv[j][0])){
						System.out.print(cv[j][1]);
						flag = false;
						break;
					}
				}
				if(flag){
					System.out.print(x);
				}
			}
			System.out.println();
		}
	}
}