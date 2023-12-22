import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a,b;
		while(true){
			a=s.nextInt();
			b=s.nextInt();
			if(a+b==0)System.exit(0);
			boolean ok[]=new boolean[a];
			int at=0;
			int out=0;
			for(int i=0;i<b;i++){
				String str=s.next();
				if(out+1==a)continue;
				String ans="";
				if((i+1)%3==0)ans+="Fizz";
				if((i+1)%5==0)ans+="Buzz";
				if((i+1)%3>0&&(i+1)%5>0)ans=ans+(i+1);
				if(!str.equals(ans)){
					ok[at%a]=true;
					out++;
				}
				while(true){
					at++;
					if(!ok[at%a])break;
				}
			}
			boolean p=false;
			for(int i=0;i<a;i++){
				if(!ok[i]){
					if(p)System.out.print(" ");
					System.out.print(i+1);
					p=true;
				}
			}
			System.out.println();
		}
	}
}