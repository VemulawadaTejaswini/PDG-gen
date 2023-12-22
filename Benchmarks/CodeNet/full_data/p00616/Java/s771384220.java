import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int h = sc.nextInt();
			if(n==0 && h==0) break;
			
			ArrayDeque<Integer> que = new ArrayDeque<Integer>();
			String s;
			int a, b, c;
			
			for(int i=0;i<h;i++){
				s = sc.next();
				a = sc.nextInt()-1;
				b = sc.nextInt()-1;
				if(s.charAt(1)=='y'){
					for(int z=0;z<n;z++){
						c = z*1000000+b*1000+a;
						if(que.contains(c)==false) que.offer(c);
					}
				}else if(s.charAt(0)=='y'){
					for(int x=0;x<n;x++){
						c = b*1000000+a*1000+x;
						if(que.contains(c)==false) que.offer(c);
					}
				}else{
					for(int y=0;y<n;y++){
						c = b*1000000+y*1000+a;
						if(que.contains(c)==false) que.offer(c);
					}
				}
			}
			System.out.println(n*n*n-que.size());
		}	
	}	
}