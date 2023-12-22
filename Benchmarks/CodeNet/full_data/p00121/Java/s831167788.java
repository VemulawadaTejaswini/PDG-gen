import java.math.*;
import java.util.*;
  
  

public class Main {

	static HashMap<String, Integer> dp=new HashMap<String, Integer>();
	static int distance[]= {1,-1,4,-4};
	public static void main(String[] args) {
		bfs();
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
        	String s=scan.nextLine();
        	s=s.replace(" ", "");
        	System.out.println(dp.get(s));
        	
        }
        
        
        
        
	}
	public static void bfs() {
		Queue<String> que=new LinkedList<String>();
		que.add("01234567");
		dp.put("01234567",0);
		while(que.size()>0) {
			String now=que.poll();
			int p=0;
			for(int j=0;j<8;j++) {
				if(now.charAt(j)=='0') {
					p=j;
					break;
				}
			}
			for(int i=0;i<4;i++) {
				int n=p+distance[i];
				if(n>=0&&n<8&&!(p==3&&i==0)&&!(p==4&&i==1)) {
					char next[]=now.toCharArray();
					next[p]=now.charAt(n);
					next[n]=now.charAt(p);
					String find=String.valueOf(next);
					if(!dp.containsKey(find)) {
						dp.put(find, dp.get(now)+1);
						que.add(find);
					}
				}
			}
		}
		
	}
	
	
	
	
	
}
