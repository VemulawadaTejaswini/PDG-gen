import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point[] arr = new Point[n];
		int zero = 0;
		for(int i=0;i<n;i++){
			
			arr[i] = new Point(sc.nextInt(), sc.nextInt(), sc.nextInt());
			
			if(arr[i].h==0)
			    zero++;
		}
		
		/*if(zero==n){
		    System.out.println("0 0 1");
		}*/
		//else{
			
			Arrays.sort(arr, new Comparator<Point>(){

				@Override
				public int compare(Point arg0, Point arg1) {
					// TODO Auto-generated method stub
					return -Integer.compare(arg0.h, arg1.h);
				}
				
			});
			
    		int h = 0;
    		boolean val=true;
    		L1:for(int x=0;x<=100;x++){
    			for(int y=0;y<=100;y++){
    				val=true;
    				for(int i=0;i<n;i++){
    					if(i==0){
    						h = Math.abs(x-arr[i].x)+Math.abs(y-arr[i].y)+arr[i].h;
    					}
    					else{
    						if(Math.max(h-Math.abs(x-arr[i].x)-Math.abs(y-arr[i].y), 0)!=arr[i].h){
    							val=false;
    							break;
    						}
    					}
    				}
    				if(val && h>=1){
    					System.out.println(x+" "+y+" "+h);
    					break L1;
    				}
    			}
    		}   
		//}
	}
}
class Point{
	int x, y, h;
	Point(int x, int y, int h){
		this.x=x;
		this.y=y;
		this.h=h;
	}
}
/*
4
2 3 5
2 1 5
1 2 5
3 2 5

5
2 3 5
2 1 5
1 2 5
3 2 5
10 20 0

2
47 23 0
10 20 0
*/