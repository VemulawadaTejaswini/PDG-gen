import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		while(true){
			int a=s.nextInt();
			String b=s.next();
			if(a==0&&b.equals("0"))System.exit(a);
			int ans=-1;
			boolean panai=false;
			String ret="";
			for(int i=0;i<(1<<(b.length()-1));i++){
				int now=0;
				int reg=0;
				for(int j=0;j<b.length();j++){
					reg=reg*10+(b.charAt(j)-'0');
					if((i&(1<<j))>0||j==b.length()-1){
						now+=reg;
						reg=0;
					}
				}
				if(ans==now)panai=true;
				if(now<=a&&ans<now){
					ans=now;
					panai=false;
					ret=" ";
					for(int j=0;j<b.length();j++){
						ret=ret+b.charAt(j);
						if((i&(1<<j))>0)ret+=" ";
					}
				}
			}
			if(panai)System.out.println("rejected");
			else if(ans==-1)System.out.println("error");
			else System.out.println(ans+ret);
		}
	}
}