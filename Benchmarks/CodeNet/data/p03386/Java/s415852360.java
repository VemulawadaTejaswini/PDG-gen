import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int[] ans = new int[k*2];
		
		for(int i=0; i<k; i++){
		    if(a+i<b){
		        ans[i] = a+i;
		        System.out.println(ans[i]);
		        count++;
		    }
		}
		
		int flg = 0;
		
		for(int i=k-1; i>=0; i--){
		    if(b-i>a && flg==0){
		        for(int j=0; j<count; j++){
		            if(b-i == ans[j]){
		                flg = 1;
		            }
		        }
		        System.out.println(b-i); 
		    }
		}
    }
}
