import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int[] b = new int[1001];
		int[] d = new int[a];
		for(int i = 0; i < a; i++){
			d[i] = sc.nextInt();
			b[d[i]] ++;
		}
		int c = 0; 
		for(int i = 0; i < 1000; i++){
			if(b[i] > 0){
				b[i]--;
              //System.out.println(i);
				for(int j = i; j < 1000; j++){
					if(b[j] > 0){
						b[j] --;
                      //System.out.println(j);
						for(int k = j; k < 1000; k++){
							if(b[k] > 0){
                              //System.out.println(i);
                              //System.out.println(j);
                              //System.out.println(k);
                              
									if(i + j  > k && i + k  > j && k + j  > i ){
										c++;
                                      //System.out.println(4);
									}
							}
							
						}
						b[j] ++;
						
					}
					
				}
				b[i] ++;
				
			}
			
		}
		System.out.println(c);
		
		
	}
}