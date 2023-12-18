import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		HashMap <String,Deque>map=new HashMap<String,Deque>();
		int N=stdIn.nextInt();
		String S=stdIn.next();
		int z=0,y=1,ans=0;
		while(y<=N){
			while(z+y<N+1){
				String a=S.substring(z,z+y);
				Deque <Integer>c=new ArrayDeque<Integer>();
				if(map.containsKey(a)==false){
					c.add(z);
					map.put(a,c);
				}
				else{
					c=map.get(a);
					for(int i=0;i<c.size();i++){
						if(c.peek()<=z){
							if(c.peek()+a.length()<z)
								if(a.length()>ans)
									ans=a.length();
						}
						else
							if(z+a.length()<c.peek())
								if(a.length()>ans)
									ans=a.length();
					}
					c.add(z);
					map.put(a,c);
				}
				z++;
			}z=0;
			y++;
		}
		System.out.println(ans);
	}
}