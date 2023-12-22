import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static int[] out = new int[]{0000, 1111, 2222, 3333, 4444, 5555, 6666, 7777, 8888, 9999};
	public static int[] dir = new int[]{1000, 100, 10, 1};
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}else{
				boolean flag = false;
				for(int i : out){
					if(n == i){
						System.out.println("NA");
						flag = true;
						break;
					}
				}
				
				if(flag){
					continue;
				}
			}
			
			int count = 0;
			int cur = n;
			while(cur != 6174){				
				ArrayList<Integer> upper = new ArrayList<Integer>();
				ArrayList<Integer> downer = new ArrayList<Integer>();
				
				for(int i = 0; i < dir.length; i++){
					upper.add((cur / dir[i]) % 10);
					downer.add((cur / dir[i]) % 10);
				}
				
				Collections.sort(upper);
				Collections.sort(downer, Collections.reverseOrder());
				
				//System.out.println(upper);
				//System.out.println(downer);
				
				int up = 0, down = 0;
				for(int i = 0; i < dir.length; i++){
					up += upper.get(i) * dir[i];
					down += downer.get(i) * dir[i];
				}
				
				cur = down - up;
				count++;
				
				if(cur == 6174){
					break;
				}
			}
			
			System.out.println(count);
		}
		
		sc.close();
	}
}