import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(); 
		int W = sc.nextInt(); 
		List<Boolean> MAP = new ArrayList<>();
		
		for(int i = 0; i < H; i++){
			String a = sc.next();
			
			for(int ii = 0; ii < W; i++){
				String ia = a.substring(ii,ii+1); 
				if(a.equals("#")){
					MAP.add(true);
				}else{
					MAP.add(false);
				}
			}
		}
		
		for(int i = 0; i < H*W; i++){
			if(MAP.get(i)){
				//↑判定
				if(i>W){
					if(MAP.get(i-W)){
						Yes();
						return;
					}
				}
				//←
				if(i > 0 && ((i - 1)% W) != 0){
					if(MAP.get(i-1)){
						Yes();
						return;
					}
				}
				
				//→
				if(i < H*W && i % W != 0){
					if(MAP.get(i+1)){
						Yes();
						return;
					}
				}
				
				if(i < H*W - W + 1){
					if(MAP.get(i+W)){
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

