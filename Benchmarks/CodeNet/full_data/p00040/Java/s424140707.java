import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		char[] k1 = "this".toCharArray();
		char[] k2 = "that".toCharArray();
		for(int i=0;i<4;i++){k1[i]=(char) (k1[i]-'a');k2[i]=(char) (k2[i]-'a');}
		while(n-->0){
			String k = bf.readLine();
			int a=0,b=0;
			for(a=1;a<26;a++){
				boolean f=false;
				if(a%2==0||a%13==0)continue;
				for(b=0;b<26;b++){
					char[] ka = new char[4];
					char[] kb = new char[4];
					for(int i=0;i<4;i++){ka[i]=(char)((k1[i]*a+b)%26+'a');kb[i]=(char)((k2[i]*a+b)%26+'a');}
					if(k.indexOf(String.valueOf(ka))>=0||k.indexOf(String.valueOf(kb))>=0){
						f=true;
						break;
					}
				}
				if(f)break;
			}
			int p = 0;
			while((26*p+1)%a>0)p++;
			int x = (26*p+1)/a;
			char[] c = k.toCharArray();
			for(int i=0;i<c.length;i++)if(c[i]>='a'&&c[i]<='z')c[i]=(char)((x*(c[i]-'a'+26-b))%26+'a');
			System.out.println(String.valueOf(c));
		}
	}
}