import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] g = new int[a];
		int min=101;
		int max=0;
		int ans = 0;
		for(int i = 0; i<a; i++){
			int b = sc.nextInt();
			g[i]=b;
			if(b<min){
				min=b;
			}
			if(b>max){
				max=b;
			}
		}
		ans+=min;
		while(min<max){
		for(int i = 0; i <a; i++){
			if(g[i]>min){
				if(i==0){
					ans++;
				}else{
				if(g[i-1]>min){
					
				}else{
					ans++;
				}
				}
			}
		}
			min++;
		}
		System.out.println(ans);
	}
}