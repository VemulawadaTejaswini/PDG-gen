import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		int limit=0;
		str=bfr.readLine();
		String[] wa=str.split(" ");
		limit=Integer.parseInt(wa[0]);
		int min=Integer.parseInt(wa[1]);
		int max=Integer.parseInt(wa[2]);
		int sum=0;
		int tmp=0;
		int jyoukenniauwa=0;
		for(int i=1; i<=limit; i++) {
			tmp=i;
			while(tmp>=1) {
				sum+=tmp%10;
				tmp=tmp/10;
			}
			if(min<=sum && sum<=max) {
				jyoukenniauwa+=i;
			}
			sum=0;
		}
		System.out.println(jyoukenniauwa);
	}
}