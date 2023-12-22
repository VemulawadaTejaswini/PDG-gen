import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int p[]=new int[n];
		for (int i = 0; i <n; i++) {
			p[i]=sc.nextInt();
		}
		int ans=0;
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(p[j]%p[i]==0||p[i]%p[j]==0){flag=false;break;}
			}
			if(flag){ans++;}
			flag=true;
		}
		System.out.println(""+ans);
	}	
}