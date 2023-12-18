import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,x,y,z;
	int[] town;
	int[] brave;
	int ans;
	String[] S;

	Main(){
		// 整数の入力
		n = sc.nextInt();

		town = new int[n+1];
		for(int i=0;i<n+1;i++){
			town[i]=sc.nextInt();
		}

		brave = new int[n+1];
		for(int i=0;i<n;i++){
			brave[i]=sc.nextInt();
		}

		for(int i=0;i<n;i++){
			if(town[i]<brave[i]){
				ans+=town[i];
				brave[i]-=town[i];
				ans+=Math.min(town[i+1],brave[i]);
				town[i+1]-=Math.min(town[i+1],brave[i]);
			} else {
				ans+=brave[i];
			}
		}

		// 出力
		System.out.println(ans);
	}

	public static void main(String[] args){
		new Main();
	}
}