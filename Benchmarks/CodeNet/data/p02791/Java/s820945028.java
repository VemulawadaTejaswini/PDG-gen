import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		
		int n = sc.nextInt();
		
		int a=0;
		int ans=0;
		
		for(int i=0;i<n;i++){
    		a = sc.nextInt();
    		if(a<n && a>1){
    		    ans++;
    		}
		}

        System.out.println(ans);
	}
}