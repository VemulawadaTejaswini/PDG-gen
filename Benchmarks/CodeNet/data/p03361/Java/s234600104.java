import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(); 
		int W = sc.nextInt(); 
		boolean[][] MAP = new boolean[W][H];
		for(int i = 0; i < H; i++){
			String a = sc.next();
			
			for(int ii = 0; ii < W; ii++){
				String ia = a.substring(ii,ii+1); 
				if(a.equals("#")){
					MAP[ii][i] = true;
				}else{
					MAP[ii][i] = false;
					
				}
			}
		}
		
		for(int w = 0; w < W; w++){
			for(int h = 0; h < H; h++){
			if(!MAP[w][h]) continue;
				//↑判定
				if(h != 0){
					if(MAP[w][h-1]){
						continue;
					}
				}
				
				//→
				if(w != W -1){
					if(MAP[w+1][h]){
						continue;
					}
				}
				
				if(w != 0){
					if(MAP[w-1][h]){
						continue;
					}
				}
				if(h != H - 1){
					if(MAP[w][h+1]){
						continue;
					}
				}
				
				
				System.out.println("No");
				System.exit(0);
			}
		}		System.out.println("Yes");
	}
	
}
 
