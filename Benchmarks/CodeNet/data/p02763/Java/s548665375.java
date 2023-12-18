import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		String S=stdIn.next();
		char s[]=S.toCharArray();
		int Q=stdIn.nextInt();
		for(int i=0;i<Q;i++){
			int q=stdIn.nextInt();
			if(q==1){
				int a=stdIn.nextInt()-1;
				char b=stdIn.next().charAt(0);
				s[a]=b;
			}
			else{
				int a=stdIn.nextInt()-1;
				int b=stdIn.nextInt();
				int ans=0;
				String c=new String(s);
				c=c.substring(a,b);
				for(int j=0;j<26;j++){
					String k=String .valueOf((char)(j+'a'));
					if(c.indexOf(k)!=-1)
						ans++;
				}
				System.out.println(ans);
			}
		}
	}
}
