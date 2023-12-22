import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		
		String q=s.nextLine();
	//	System.out.println(q);
		String[]key=q.split("\\.");
	//	System.out.println(key.length);
	//	for(int i=0;i<key.length;i++)System.out.println(key[i]);
		int now=1;
		int n=key.length;
		int d[]=new int[120];
		for(int i=0;i<120;i++)d[i]=-1;
		d[1]=0;
		boolean ok=false;
		while(s.hasNext()){
			String str=s.nextLine();
			int cnt=0;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)!=' ')break;
				cnt++;
			}
			if(d[now]==-1)d[now]=cnt;
			while(cnt<d[now]){
				d[now]=-1;
				now--;
			}
			String tmp=str.split(":")[0].substring(cnt);
		//	System.out.println(tmp);
			if(tmp.equals(key[now])){
				now++;
				if(n==now){
					if(str.split(":").length>1)System.out.println("string \""+str.split(":")[1].substring(1)+"\"");
					else System.out.println("object");
					ok=true;
					break;
				}
			}
		}
		if(!ok)System.out.println("no such property");
	}
}