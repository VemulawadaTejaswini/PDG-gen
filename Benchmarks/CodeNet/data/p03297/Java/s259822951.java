import java.util.*;
public class Sample2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int t = sc.nextInt();
		int i = 0;
		String[] result = new String[t];	
		while(0<t){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
            int j = 0;
			int flg = 0;
			            while(a-b >= 0){
				int store= a - b;
				if(store <= c){
					a = store + d;
				}else{
					a = store;
				}
            	if(j>b){
            		flg = 1;
					break;
            	}
				j++;				
			}
			if(flg ==1){
				result[i] = "Yes";
			}else{
				result[i] = "No";
			}
			i++;			
			t = t-1;	
		}
		// 出力
		for(int p =0;p<i;p++){
			System.out.println(result[p]);
		}
	}
}
