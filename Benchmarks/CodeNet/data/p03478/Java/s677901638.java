import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int sum = 0;
        
		// 整数の入力
		int cnt = sc.nextInt();
		int low = sc.nextInt();
		int high = sc.nextInt();
		
        for(int i = 1; i <= cnt; i++){
            int num = 0;
            int p;
            String q;
            p = String.valueOf(i).length();
            q = String.valueOf(i);
            
            for(int j = 0; j < p; j++){
                char ch = q.charAt(j);
                num += Character.getNumericValue(ch);
            }
            
            if((num >= low) && (num <= high)){
                sum += i;
            }
        }
        
        System.out.println(sum);
	}
}