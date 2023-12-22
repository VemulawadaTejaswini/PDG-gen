import java.util.Arrays;
import java.util.Scanner;

public class Main {

	void run(){
		Scanner sc = new Scanner(System.in);
		
		for(;;){
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x==0 && y==0) break;
			
			int[] id = new int[y];
			Arrays.fill(id, -1);
			id[x] = 0;
			int p = 0;
			int q = 0;
			int r = 1;
			for(;;){
				x = (x*10)%y;
				if(x==0){
					p = r;
					break;
				}
				if(id[x]==-1){
					id[x] = r++;
				}else{
					p = id[x];
					q = r-id[x];
					break;
				}
			}
			System.out.println(p + " " + q);
		}		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}