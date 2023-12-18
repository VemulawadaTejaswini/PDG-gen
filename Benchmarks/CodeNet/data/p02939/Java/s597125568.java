import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		int z=1,ans=1,x=1;
		String a=S.substring(0,1);
		String b="";
		while(z<S.length()){
			b=S.substring(z,z+1);
			if(a.equals(b)){
				if(z>=S.length()-1)
					ans--;
				if(z!=S.length()-1)
					b=S.substring(z,z+2);
				z++;
			}
			a=b;ans++;z++;
		}
		System.out.println(ans);
	}
}