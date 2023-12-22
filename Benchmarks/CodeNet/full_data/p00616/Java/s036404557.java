import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ1030().doIt();
	}

	class AOJ1030{
		void doIt(){
			while(true){
				int n = in.nextInt();
				int h = in.nextInt();
				if(n+h==0)break;
				int sum = 0;
				boolean xy[][] = new boolean[n][n];
				boolean yz[][] = new boolean[n][n];
				boolean xz[][] = new boolean[n][n];
				for(int i=0;i<h;i++){
					String command = in.next();
					int a = in.nextInt()-1;
					int b = in.nextInt()-1;
					if(command.equals("xy")){
						xy[a][b] = true;
						for(int s=0;s<n;s++)if(!yz[b][s])if(!xz[a][s])sum++;
					}else if(command.equals("yz")){
						yz[a][b] = true;
						for(int s=0;s<n;s++)if(!xy[s][a])if(!xz[s][b])sum++;
					}else if(command.equals("xz")){
						xz[a][b] = true;
						for(int s=0;s<n;s++)if(!yz[s][b])if(!xy[a][s])sum++;
					}
				}
				System.out.println(n*n*n-sum);
			}
		}
	}
}