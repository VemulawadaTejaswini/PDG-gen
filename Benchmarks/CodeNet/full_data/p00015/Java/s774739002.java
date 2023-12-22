import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static final int MAX=80;

	public static int[] add(int[] a, int[] b) {
		int[] ans=new int[MAX];
		
		boolean carry=false;
		for(int i=0; i<ans.length; i++) {
			ans[i]=a[i]+b[i];
			if(carry) ans[i]++;
			carry=false;
			if(ans[i]>9) {
				ans[i]-=10;
				carry=true;
			}
		}
		if(carry) {
			ans[ans.length-1]=-10;
		}
		return ans;
	}
	
	public static void print(int[] a) {
		int i;
		if(a[a.length-1]<0) {
			System.out.println("overflow");
			return ;
		}
		// 0の桁をスキップ
		for(i=a.length-1; i>=0&&a[i]==0; i--);
		// 出力
		for( ; i>=0; i--) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	public static int[] readNumber(String line) {
		int[] num=new int[MAX];
		for(int i=line.length()-1; i>=0; i--) {
			String str=line.substring(i, i+1);
			num[line.length()-1-i]=Integer.parseInt(str);
		}
		return num;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in), 1);
		String line=br.readLine();
		int n=Integer.parseInt(line);
		for(line=br.readLine(); line!=null; line=br.readLine()) {
			if(line.length()==0)
				break;
			int[] ans=readNumber(line);
			for(int i=1; i<n; i++) {
				line=br.readLine();
				int[] temp=readNumber(line);
				ans=add(ans, temp);
			}
			print(ans);
		}

	}

}