import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int len = S.length();
		int[] ans = new int[len];
		int evepool = 0; // 偶数
		int oddpool = 0; // 奇数
		int lastR = 0;
		int firstL = 0;
		for(int i=0;i<len;i++){
			String tmp = S.substring(i,i+1);
			if("R".equals(tmp)){
				lastR = i;
				if(i%2==0){evepool++;}
				else{oddpool++;}
			}else{
				if(i-lastR==1){
					firstL=i;
					if(i%2==0){
						ans[i]+=evepool+1;
						ans[lastR]+=oddpool;
						evepool=0;
						oddpool=0;
					}else{
						ans[i]+=oddpool+1;
						ans[lastR]+=evepool;
						evepool=0;
						oddpool=0;
					}
				}else{
					if((i-firstL)%2==0){
					  ans[firstL]++;
					}else{
					  ans[lastR]++;
					}
				}
			}
		}
		for(int i=0;i<len;i++){
			if(i > 0)System.out.print(" ");
			System.out.print(ans[i]);	
		}
	}
}