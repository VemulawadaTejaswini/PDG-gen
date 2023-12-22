import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		while(true){
			int n=s.nextInt();
			if(n==0)System.exit(0);
			String str=s.next();
			for(int i=0;i<n;i++){
				char now=str.charAt(0);
				int times=0;
				String next="";
				for(int j=0;j<str.length();j++){
					if(now==str.charAt(j))times++;
					else{
						next=next+times+now;
						now=str.charAt(j);
						times=1;
					}
				}
				if(times>0)next=next+times+now;
				str=next;
				//System.out.println(str);
			}
			System.out.println(str);
		}
	}
}