import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		StringBuffer sb = new StringBuffer(S);
		String ans = sb.reverse().toString();
		int Q=stdIn.nextInt();
		boolean key=false;
		for(int i=0;i<Q;i++){
			int q=stdIn.nextInt();
			if(q==1)
				if(key==false)
					key=true;
				else
					key=false;
			else{
				int f=stdIn.nextInt();
				String a=stdIn.next();
				if((f==1&&key==false)||(f==2&&key)){
					S=a+S;ans=ans+a;
				}
				else{
					S=S+a;ans=a+ans;
				}
			}
		}
		if(key){
			System.out.println(ans);
		}
		else
			System.out.println(S);
	}
}
