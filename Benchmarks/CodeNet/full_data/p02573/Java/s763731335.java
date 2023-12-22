import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for (int i =0;i<m;i++) {
			a[i] = sc.nextInt()-1;
			b[i] = sc.nextInt()-1;
		}
        int[] u = new int[n];
        for(int i=0;i<n;i++){
        	u[i] = i;
        }
        for (int i =0;i<m;i++) {
        	if(u[a[i]]>u[b[i]]){
        		u[a[i]]=u[b[i]];
        		for(int k=0;k<n;k++){
                	if(u[k]==u[a[i]]){u[k]=u[a[i]];}
                }
        		}
        	if(u[a[i]]<=u[b[i]]){
        		u[b[i]]=u[a[i]];
        		for(int k=0;k<n;k++){
                	if(u[k]==u[a[i]]){u[k]=u[a[i]];}
                }}
		}
        int p = saihinnchi(u);
        System.out.println(""+p);
	}
	public static int saihinnchi(int a[]){
		Arrays.sort( a );
		   
		    		// 最頻値
		    		int pre_mode, num, max_num;
		    		int mode;
		    
		    		// 初期値を代入
		    		mode = a[ 0 ];	// 最頻値の初期値	
		    		max_num = 1;	// 最大出現数の初期値
		   
		   		pre_mode = a[ 0 ];	// 出現する回数を数える値
		    		num = 1;		// 出現回数
		   
		   		for ( int i = 1; i < a.length; ++ i ) {
		   			if ( pre_mode == a[ i ] ) {
		   				// 同じ値の場合
		    				// 出現回数に1を足す
		   				++ num;
		    			}
		    			else {
		   				// 違う同じ値の場合
		    				if ( num > max_num ) {
		    					mode = pre_mode;
		    					max_num = num;
		    				}
		    
		   				// 出現する回数を数える値を変更
		    				pre_mode = a[ i ];
		    				num = 1;
		   			}
		  		}
		    
		 		// 後処理
		   		if ( num > max_num ) {
		    			mode = pre_mode;
		    			max_num = num;
		    		}
		    
		    
		    		// 結果表示
		   return(max_num);  	
	}
}