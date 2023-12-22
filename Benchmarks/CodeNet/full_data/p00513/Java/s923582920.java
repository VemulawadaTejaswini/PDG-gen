import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt = 0;
		int p, q;
		for(int i=0;i<n;i++){
			p = sc.nextInt();
			
			if((p-1)%3==0 || (p-2)%5==0 || (p-3)%7==0){
				cnt++;
			}else{
				for(int j=5;j<Integer.MAX_VALUE/2;j++){
					if(p-j<2*j+1) break;
					else if((p-j)%(2*j+1)==0){
						cnt++;
						break;
					}
					j++;
					if(p-j<2*j+1) break;
					else if((p-j)%(2*j+1)==0){
						cnt++;
						break;
					}
					j++;
				}
			}
		}
		System.out.println(n-cnt);
	}	
}