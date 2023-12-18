import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(); 
		int W = sc.nextInt(); 
		boolean[][] MAP = new boolean[W][H];
		
		for(int i = 0; i < H; i++){
			String a = sc.next();
			
			for(int ii = 0; ii < W; i++){
				String ia = a.substring(ii,ii+1); 
				if(a.equals("#")){
					MAP[i][ii] = true;
				}else{
					MAP[i][ii] = false;
				}
			}
		}
		
		for(int w = 0; w < W; w++){
			for(int h = 0; h < H; h++){
			if(!MAP[w][h]) continue;
				//↑判定
				if(h!=0){
					if(MAP[w][h]){
						Yes();
						return;
					}
				}
				
				//→
				if(w != W){
					if(MAP[w][h]){
						Yes();
						return;
					}
				}
				
			}
		}
		System.out.println("No");
	}
	
	public static void Yes(){
		System.out.println("Yes");
		
	}
}
 
