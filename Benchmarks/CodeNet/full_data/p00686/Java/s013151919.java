import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0 && h==0) break;
			
			String s;
			int t;
			int d = 0;
			int x = 0;
			int y = 0;
			char c;
			while(true){
				s = sc.next();
				c = s.charAt(0);
				if(c=='S'){
					System.out.println((x+1) + " " + (y+1));
					break;
				}else if(c=='R'){
					d++;
					if(d==4) d=0;
				}else if(c=='L'){
					d--;
					if(d==-1) d=3;
				}else if((c=='F' && d==0) || (c=='B' && d==2)){
					t = sc.nextInt();
					if(y+t<h) y+=t;
				}else if((c=='F' && d==1) || (c=='B' && d==3)){
					t = sc.nextInt();
					if(x+t<w) x+=t;
				}else if((c=='F' && d==2) || (c=='B' && d==0)){
					t = sc.nextInt();
					if(y-t>=0) y-=t;
				}else if((c=='F' && d==3) || (c=='B' && d==1)){
					t = sc.nextInt();
					if(x-t>=0) x-=t;
				}	
			}
			
		}
	}	
}