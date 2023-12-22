import java.awt.Point;
import java.util.*;
public class Main {

		public static int [] t ={0,1,2,3,5,7,8,9};
        public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
            while(true){
            	int n = scan.nextInt();
            	if(n==0)break;
            	Point [] p =new Point[n];
            	for(int i=0;i<n;i++){
            		p[i] = new Point(scan.nextInt(),scan.nextInt());
            	}
            	Arrays.sort(p,new DataComparator());
            	
            	long sum=0;
            	boolean flag = true;
            	for(int i=0;i<n;i++){
            		if(sum+p[i].x<=p[i].y){
            			sum+=p[i].x;
            		}
            		else flag=false;
            		
            	}
            	System.out.println(flag?"Yes":"No");
            	
            }
        }
        
}
class unlocked DataComparator implements java.util.Comparator{
	public int compare(Object o1, Object o2) {
        Point p1 = (Point) o1;
        Point p2 = (Point) o2;
        return p1.y - p2.y;
      }
	 }