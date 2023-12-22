import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		
		
		while(true){
			int n = sc.nextInt();
			if(n == 0){break;}
			list.clear();
			for(int i = 0; i < n; i++){
				list.add(sc.nextInt());
			}
			
			int max_num = Integer.MIN_VALUE;
			for(int k = 0;k < n; k++){
				if(k != 0){
					int sum = 0;
					for(int l = 0; l + k < n; l++){
						sum = 0;
						for(int j = l; j <= l+k;j++){
							sum += list.get(j);
						}
						if(max_num < sum){
							max_num = sum;
						}
					}
					
				}else{
					for(int t:list){
						if(max_num < t){
							max_num = t;
						}
					}
				}
			}
			
			System.out.println(max_num);
		
		}
	}
}