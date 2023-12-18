import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		String S=stdIn.next();
		char s[]=S.toCharArray();
		int Q=stdIn.nextInt();
		char key[][]=new char[26][N];
		int cout[]=new int[Q];
		for(int i=0;i<N;i++){
			for(int j=0;j<26;j++){
				key[j][i]='0';
			}
			key[(int)(s[i]-'a')][i]='1';
		}
		for(int i=0;i<Q;i++){
			int q=stdIn.nextInt();
			if(q==1){
				int a=stdIn.nextInt()-1;
				char b=stdIn.next().charAt(0);
				key[(int)(s[a]-'a')][a]='0';
				key[(int)(b-'a')][a]='1';
				s[a]=b;
			}
			else{
				int a=stdIn.nextInt()-1;
				int b=stdIn.nextInt();
				int ans=0;
				for(int j=0;j<26;j++){
					String k=new String(key[j]).substring(a,b);
					int l=Integer.parseInt(k,2);
					l=l|0;
					if(l>0)
						ans++;
				}
				System.out.println(ans);
			}
		}
	}
}
