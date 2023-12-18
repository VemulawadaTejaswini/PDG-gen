import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		int t=0;
		while(n-->0){
			int a=sc.nextInt();
			if(a==1){
				t++;
			}else{
				int b=sc.nextInt();
				if(t%2!=0){
					if(b==1)
						b=2;
					else
						b=1;
				}
				String s2=sc.next();
				if(b==1){
					s=s2.charAt(0)+s+"";
				}else
					s+=s2.charAt(0)+"";
			}
		}
		if(t%2!=0){
			String s1="";
			for(int i=s.length()-1;i>=0;i--){
				s1+=s.charAt(i)+"";
			}
			s=s1;
		}
		System.out.print(s);
	}
}
