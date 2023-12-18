import java.util.*;

class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int N  = sc.nextInt();
		int YY = sc.nextInt() / 1000 ;  // 1000 |Y 
		
		int S = YY - N ;
		int x = 0;
		
		
		while(true){
			int y_4 = YY - N - 9 * x ;
			int y = y_4 / 4 ;
			int z = N - x - y ;
			if(y_4 >= 0){ // 
				if(y_4 % 4 == 0 && z >= 0){
					System.out.printf("%d %d %d ",x,y ,z);
					break;
				}
				x++;
			}else{
				System.out.println("-1 -1 -1");
				break;
			}
		}
	}
}
