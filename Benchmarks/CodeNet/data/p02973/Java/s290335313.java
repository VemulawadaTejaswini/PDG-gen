import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,x,y,z;
	int ans;
	long min = 100000000;
	long[] An;
	long num = 10000000000L;

	Main(){
		// 整数の入力
		n = sc.nextInt();
		An = new long[n];

		for(int i=0;i<n;i++){
			An[i] = sc.nextLong()*num+(long)i;
		}

		Arrays.sort(An);

		for(int i=0;i<n;i++){
          if(i>0){
			if(min>An[i]%num||(An[i-1]/num)==(An[i]/num)){
				min = An[i]%num;
				ans++;
			}
          }else{
            min = An[i]%num;
            ans++;
          }
		}

		// 出力
		System.out.println(ans);
	}

	public static void main(String[] args){
		new Main();
	}
}