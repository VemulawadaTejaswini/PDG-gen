import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int t = sc.nextInt();
		int i = 0;
		String[] result = new String[t];	
		while(0<t){
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d = sc.nextLong();
            int j = 0;
			int flg = 0;
			ArrayList<Long> array = new ArrayList<Long>();	
            while(a-b >= 0){
				long store= a % b;
				if(store <= c){
					a = store + d;
				}else{
					a = store;
				}

            	
              if(array.contains(a)){
					flg = 1;
					break;
				}
            	
                array.add(a);
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