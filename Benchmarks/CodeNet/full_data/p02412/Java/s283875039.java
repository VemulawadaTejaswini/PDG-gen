import java.util.*;
import java.lang.StringBuilder;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int c = 0;
		int n,x;
		do{
			n = sc.nextInt();
			x = sc.nextInt();
			c = 0;
			if(n==0&&x==0){
				break;
			}
			for(int i = 1;i <= n;i++){
				for(int o = 1;o <= n;o++){
					if(o==i){
						break;
					}
					for(int k = 1;k <= n;k++){
						if(i==k){
							break;
						}else if(o==k){
							break;
						}else if(i+o+k==x){
							++c;
						}
					}
				}
			}
			sb.append(c).append("\n");
		}while(true);
		System.out.print(sb);
	}
}