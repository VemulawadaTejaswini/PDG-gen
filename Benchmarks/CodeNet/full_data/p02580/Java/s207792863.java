
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		try{
				int h=sc.nextInt();
				int w=sc.nextInt();
				int m=sc.nextInt();
				int fr[]=new int[h];
				int fc[]=new int[w];
				HashSet<String> s=new HashSet<>();
				for(int i=0;i<m;i++) {
					int x=sc.nextInt()-1;
					int y=sc.nextInt()-1;
					fr[x]++;
					fc[y]++;
					String ss=x+","+y;
					s.add(ss);
			
				}
				
				int max=Integer.MIN_VALUE;
				int r=0;
				ArrayList<Integer> xx=new ArrayList<>();
				ArrayList<Integer> yy=new ArrayList<>();
				for(int i=0;i<fr.length;i++) {
					max=Math.max(max,fr[i]);
				}	int c=0;
				int maxq=Integer.MIN_VALUE;
				for(int i=0;i<fc.length;i++) {
					maxq=Math.max(maxq,fc[i]);
				}
				for(int i=0;i<h;i++) {
					if(max==fr[i]) {
						xx.add(i);
					}
				}
				for(int i=0;i<w;i++) {
					if(maxq==fc[i]) {
						yy.add(i);
					}
				}
					
				int ans=maxq+max;
//				for(int i:xx) {
//					System.out.print(i+" ");
//				}
//				System.out.println();
//				
//				for(int i:yy) {
//					System.out.print(i+" ");
//				}
//				System.out.println();
		boolean b=true;
		s:for(int i:xx) {
			for(int j:yy) {
				if(!s.contains(i+","+j)) {
					b=false;
					break s;
				}
			}
		}
		
		if(b==true) {
			ans--;
		}
			
			System.out.println(ans);
			
			
			
//		}catch(Exception e){
//		    return;
//		}
	}


	

}
class Pair{
	int x;
	int y;
	Pair(int x,int y){
		this.x=x;
		this.y=y;
	}
}