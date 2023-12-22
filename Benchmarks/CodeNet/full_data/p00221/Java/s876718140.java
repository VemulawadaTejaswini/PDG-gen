import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Main {
	
	class Link{
		public Link next;
		public int value;
		public String toString(){
			return Integer.toString(value);
		}
	}

	BufferedReader input;
	
	String ns() throws Exception{
		return input.readLine();
	}
	
	String fizzbuzz(int i){
		String str="";
		
		if(i%3!=0&&i%5!=0){
			str=Integer.toString(i);
		}
		else{
			if(i%3==0){
				str+="Fizz";
			}
			if(i%5==0){
				str+="Buzz";
			}
		}
		return str;
	}
	
	void solve(){
		input=new BufferedReader(new InputStreamReader(System.in));
		int m, n;
		
		try {
			while(true){
				StringTokenizer tok=new StringTokenizer(ns());
				m=Integer.parseInt(tok.nextToken());
				n=Integer.parseInt(tok.nextToken());
				int remain=0;
				
				if(m==0&&n==0) break;
				
				Link start=new Link();
				Link prev=start;
				for(int i=1;i<=m;++i){
					prev.next=new Link();
					prev.next.value=i;
					prev=prev.next;
					++remain;
				}
				prev.next=start.next;
				
				Link now=start;
				for(int i=1;i<=n;++i){
					String s=ns();
					if(remain>1){
						if(s.compareTo(fizzbuzz(i))!=0){
							Link x=now.next;
							if(x==start.next) start.next=x.next;
							now.next=now.next.next;
							x=null;
							--remain;
						}
						else now=now.next;
					}
				}
				now=start.next;
				boolean first=true;
				do{
					if(first) first=false; else System.out.print(" ");
					System.out.print(now.value);
					now=now.next;
				}while(now!=start.next);
				System.out.println();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	void dbug(Object...os){
		System.err.println(Arrays.deepToString(os));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().solve();
	}

}