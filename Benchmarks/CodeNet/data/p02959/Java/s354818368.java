import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,x,y,z;
	int[] town1;
	int[] brave1;
	int[] town2;
	int[] brave2;
	int ans1,ans2;
	String[] S;

	Main(){
		// 整数の入力
		n = sc.nextInt();

		town1 = new int[n+1];
		town2 = new int[n+1];
		for(int i=0;i<n+1;i++){
			town1[i]=sc.nextInt();
			town2[i]=town1[i];
		}

		brave1 = new int[n];
		brave2 = new int[n];
		for(int i=0;i<n;i++){
			brave1[i]=sc.nextInt();
			brave2[i]=brave1[i];
		}

		for(int i=0;i<n;i++){
			if(town1[i]<brave1[i]){
				ans1+=town1[i];
				brave1[i]-=town1[i];
				ans1+=Math.min(town1[i+1],brave1[i]);
				town1[i+1]-=Math.min(town1[i+1],brave1[i]);
			} else {
				ans1+=brave1[i];
			}
		}

		for(int i=n-1;i>=0;i--){
			if(town2[i+1]<brave2[i]){
				ans2+=town2[i+1];
				brave2[i]-=town2[i+1];
				ans2+=Math.min(town2[i],brave2[i]);
				town2[i]-=Math.min(town2[i],brave2[i]);
			} else {
				ans2+=brave2[i];
			}
		}

		// 出力
		System.out.println(Math.max(ans1,ans2));
	}

	public static void main(String[] args){
		new Main();
	}
}