import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x==0 && y==0) break;
			
			int[] id = new int[y];
			Arrays.fill(id, -1);
			int cnt = 1;
			id[x] = 0;
			while(true){
				x = (x*10)%y;
				if(x==0){
					System.out.println(cnt + " 0");
					break;
				}
				if(id[x]!=-1){
					System.out.println(id[x]+ " " + (cnt-id[x]));
					break;
				}
				
				id[x] = cnt;
				cnt++;
			}
		}	
	}
	
}