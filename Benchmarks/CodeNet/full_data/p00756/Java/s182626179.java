import java.awt.geom.Point2D;
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj1155().doIt();
    }
    class aoj1155{
    	int dp_table(int n){
    		Circle[] c=new Circle[n];
            int[] a=new int[n];
            for(int i=0; i<n; i++){
                c[i]=new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()-1);
                for(int j=0; j<i;j++){
                	if(c[i].dis+c[j].dis > c[i].p.distance(c[j].p)) a[i] |= (1<<j);
                }
            }
            int ans=n;
            boolean[] dp=new boolean[1<<n];
            dp[(1<<n)-1]=true;
            for(int i=(1<<n)-1; i>=0; i--){
            	if(dp[i]){
            		for(int j=0; j<n; j++){
            			if((i&(1<<j))>0 && (i&a[j])==0){
            				for(int k=j+1; k<n; k++){
            					if(j!=k && (i&(1<<k))>0 && (i&a[k])==0 && c[j].color==c[k].color){
            						int tmp=(1<<j)|(1<<k);
            						int next=i&(((1<<n)-1)^tmp);
            						dp[next]=true;
            						ans = Math.min(ans, Integer.bitCount(next));
            					}
            				}
            			}
                    }
                }
            }
            return -(ans - n);
    	}
    	void doIt(){
    		while(true){
    			int n = sc.nextInt();
    			if(n == 0)break;
                System.out.println(dp_table(n));
    		}
    	}
    	class Circle{
    		Point2D p;
    		double dis;
    		int color;
    		public Circle(double x,double y,double dis,int color){
    			this.p = new Point2D.Double(x,y);
    			this.dis = dis;
    			this.color = color;
    		}
    	}
     }
}