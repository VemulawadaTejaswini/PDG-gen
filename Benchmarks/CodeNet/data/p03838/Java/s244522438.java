import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		long x = Long.parseLong(stk.nextToken());
		long y = Long.parseLong(stk.nextToken());
		long rta = 0;
		if(x < 0){
			if(y<0){
				if(x<y){
					System.out.println(Math.abs((y*-1) -(x*-1)));
				}else{
					System.out.println(Math.abs((y*-1) -(x*-1))+2);
				}
			}else{
				if(x*-1<y){
					System.out.println(Math.abs((y) -(x*-1))+1);
				}else if(x*-1==y){
					System.out.println(1);
				}else{
					if(y==0) System.out.println(x*-1);
					else System.out.println(Math.abs((x*-1) -(y))+1);
				}
			}
		}else{
			if(y<0){
				if(x<y*-1){
					System.out.println(Math.abs((y*-1) -(x))+1);
				}else if(x==y*-1){
					System.out.println(1);
				}else{
					System.out.println(Math.abs(x-(y*-1))+1);
				}
			}else{
				if(x>y){
					if(y==0) System.out.println(x+1);  
					else System.out.println(Math.abs((y)-(x))+2);
				}else{
					System.out.println(Math.abs((y)-(x)));
				}
			}
		}
		/*if(x > y){
			if(x < 0 && y < 0)
				rta+=1;
			rta += Math.abs(Math.abs(x) - Math.abs(y));
			rta+=1;
		}
		else if(x < y){
			if(x < 0 && y > 0)
				rta+=1;
			if(x <0 && Math.abs(x) > Math.abs(y))
				rta+=1;
			rta += Math.abs(Math.abs(x) - Math.abs(y));
		}
		if(x == 0 || y == 0)
			rta = Math.abs(Math.abs(x) - Math.abs(y));
		System.out.println(rta);*/
	}

}
