import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x==0 && y==0) break;
			
			int[] index = new int[y];
			Arrays.fill(index, -1);
			int p = x;
			int cnt = 0;
			while(true){
				p %= y;
				if(p==0){
					System.out.println(cnt + " 0");
					break;
				}else if(index[p]!=-1){
					System.out.println(index[p]+ " " + (cnt-index[p]));
					break;
				}else{
					index[p] = cnt;
					cnt++;
					p *= 10;
				}
			}
		}	
	}
	
}