import java.util.*;
public class Main {
	//0925 start
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int w = sc.nextInt();
			int d = sc.nextInt();
			if((w|d) == 0) break;
			int [] data = new int[w];
			int sum = 0;
			for(int i = 0 ; i < w; i++){
				data[i] = sc.nextInt();
				sum += data[i];
			}
			boolean [] used = new boolean[w];
			for(int i = 0 ; i < d; i++){
				int h = sc.nextInt();
				boolean flg = false;
				for(int j = 0 ; j < w; j++){
					if(h == data[j] && used[j] == false){
						used[j] = true;
						flg = true;
						break;
					}
				}
				if(! flg){
					sum += h;
				}
			}
			System.out.println(sum);
		}
	}

	public static void main(String [] args){
		new Main().doit();
	}
}