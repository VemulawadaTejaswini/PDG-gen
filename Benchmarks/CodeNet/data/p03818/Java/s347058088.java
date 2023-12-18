import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d= new int[100001];
		for(int i=0;i<n;i++){
			d[sc.nextInt()]++;
		}
		int o=0;
		int e=0;
		for(int i=0;i<=100000;i++){
			if(d[i]!=0){
				if(d[i]%2==0){
					e++;
				}else{
					o++;
				}
			}
		}
		int sum=o+2*(e/2);
		System.out.println(sum);
		
	}
}