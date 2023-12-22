import java.util.*;
import java.math.*;
import java.text.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> tri = new ArrayList<Integer>();
		for(int i=1; ; i++){
			if(i*(i+1)*(i+2)/6>1000000) break;
			tri.add(i*(i+1)*(i+2)/6);
		}
		while(true){
			int n = in.nextInt();
			if(n==0) break;
			// use all trinumber
			int k=-1;
			for(int i=0; tri.get(i)<=n && i<tri.size()-1; i++){
				k++;
			}
			int ans = 1000000;
			int begin = k;
			do{
				int start = k;
				int preans = 0;
				int caln = n;
				while(caln!=0){
					if(caln>=tri.get(start)){
						caln = caln-tri.get(start);
						preans++;
					}
					else start--;
				}
				k--;
				if(ans>preans) ans = preans;
			}while(n<tri.get(k)*ans);

			int ans2 = 1000000;
			do{
				int start = begin;
				int preans = 0;
				int caln = n;
				while(caln!=0){
					if(caln>=tri.get(start) && tri.get(start)%2==1){
						caln = caln-tri.get(start);
						preans++;
					}
					else start--;
				}
				k--;
				if(ans2>preans) ans2 = preans;
				if(k<0) break;
			}while(n<tri.get(k)*ans2);
			
			System.out.println(ans+" "+ans2);
		}
	}
}