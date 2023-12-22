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
			int cnt = 1;
			id[x] = 0;
			int size = 0;
			for(;;){
				x = (x*10)%y;
				if(x==0) break;
				if(id[x]==-1){
					id[x] = cnt;
					cnt++;
				}else{
					size = cnt-id[x];
					cnt = id[x];
					break;
				}
			}
			System.out.println(cnt + " " + size);
		}		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}