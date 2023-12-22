import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static boolean isValid(int[] u){
		int[] x = new int[10];
		for(int i=1;i<10;i++){
			x = Arrays.copyOf(u, 10);
			if(x[i]>=2){
				x[i]-=2;
				if(search(x, 1))return true;
				x[i]+=2;
			}
		}
		return false;
	}
	public static boolean search(int[] x,int k){
		if(k==10)return true;
		if(x[k]==0)return search(x, k+1);
		// あんこ
		if(x[k]>=3){
			x[k]-=3;
			if(search(x, k))return true;
			x[k]+=3;
		}
		if(k>=8)return false;
		// しゅんつ
		boolean f = true;
		for(int i=k;i<k+3;i++)if(x[i]==0)f = false;
		if(!f)return false;
		for(int i=k;i<k+3;i++)x[i]--;
		if(search(x, k))return true;
		for(int i=k;i<k+3;i++)x[i]++;
		return false;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int[] u = new int[10];
		while((s=bf.readLine())!=null){
			char[] c = s.toCharArray();
			Arrays.fill(u, 0);
			for(int i = 0;i<c.length;i++){
				int n = c[i]-'0';
				u[n]++;
			}
			boolean f = false;
			for(int i = 1;i<10;i++){
				if(u[i]>=4)continue;
				u[i]++;
				if(isValid(u)){
					f = true;
					System.out.print(i+" ");
				}
				u[i]--;
			}
			System.out.println(f?"":"0");
		}
	}
}