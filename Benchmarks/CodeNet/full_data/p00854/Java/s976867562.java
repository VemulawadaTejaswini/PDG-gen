import java.util.*;
import java.awt.geom.*;
public class Main {

	//2332 start
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			if((n|m|k) == 0) break;
			boolean [] stones = new boolean[n];
			stones[m-1] = true;
			int step = k;
			int restnum = n-1;
			for(int i = m-1;;i++){
				if(stones[i%n]){
					continue;
				}
				else{
					step--;
					if(step == 0){
						stones[i%n] = true;
						restnum--;
						if(restnum == 0){
							int res = (i%n) + 1;
							System.out.println(res);
							break;
						}
						step = k;
					}
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}