import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int p[]=new int[n];
		boolean b[]=new boolean[n];
		for (int i = 0; i <n; i++) {
			p[i]=sc.nextInt();
			b[i]=true;
		}
		int ans=0;
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(b[j]){
				if(p[i]<p[j]){continue;}
              	else if(p[i]==p[j]){if(i==j){continue;}else{flag=false;break;}}
				else if(p[i]%p[j]==0){flag=false;b[i]=false;break;}
				}
			}
			if(flag){ans++;}
			flag=true;
		}
		System.out.println(""+ans);
	}	
}