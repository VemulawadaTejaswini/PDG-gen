package p1101;
import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int Case=sc.nextInt();sc.nextLine();
		while (Case--!=0){
			String str=sc.nextLine();
			int n=sc.nextInt();sc.nextLine();
			int cursor=0;
			for(int i=0;i<n;i++){
				String op=sc.nextLine();
				if("forward word".equals(op)){
					if(str.length()==cursor)continue;
					if(str.charAt(cursor)==' '){
						while(cursor<str.length() && str.charAt(cursor)==' ')cursor++;
					}
					while(cursor<str.length() && str.charAt(cursor)!=' ')cursor++;
				}else if("forward char".equals(op)){
					cursor=Math.min(str.length(),cursor+1);
				}else if("backward word".equals(op)){
					if(cursor==0)continue;
					if(str.charAt(cursor-1)==' '){
						while(cursor>0  && str.charAt(cursor-1)==' ')cursor--;
					}
					while(cursor>0  && str.charAt(cursor-1)!=' ')cursor--;
				}else if("backward char".equals(op)){
					cursor=Math.max(0, cursor-1);
				}else if("delete char".equals(op)){
					if(cursor==str.length())continue;
					str=str.substring(0,cursor)+str.substring(cursor+1);
				}else if("delete word".equals(op)){
					int e=cursor;
					while(e<str.length() && str.charAt(e)==' ')e++;
					if(e==str.length())continue;
					while(e<str.length() && str.charAt(e)!=' ')e++;
					str=str.substring(0,cursor)+str.substring(e);
				}else if(op.startsWith("insert")){
					int s=-1,e=-1;
					for(int index=0;index<op.length();index++){
						if(op.charAt(index)=='"'){
							if(s==-1)s=index;
							else e=index;
						}
					}
					String word=op.substring(s+1,e);
					str=str.substring(0,cursor)+word+str.substring(cursor);
					cursor+=word.length();
				}
			}
			ln(str.substring(0,cursor)+"^"+str.substring(cursor));
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
	public static void pr(Object o) {
		System.out.print(o);
	}
	public static void ln(Object o) {
		System.out.println(o);
	}
	public static void ln() {
		System.out.println();
	}
}