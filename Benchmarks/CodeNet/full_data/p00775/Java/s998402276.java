import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj1194().doIt();
    }
    class aoj1194{
    	int po_h[] = new int[21];
    	int ne_h[] = new int[21];
    	void clear(){
    		for(int i = 0;i < 21;i++){
    			po_h[i] = 0;
    			ne_h[i] = 0;
    		}
    	}
    	void bar(int n){
    		for(int i = 0;i < n;i++){
    			int xl = sc.nextInt();
    			int xr = sc.nextInt();
    			int h = sc.nextInt();
    			if(xr <= 0){
    				for(int j = -xr;j < -xl;j++){
    					ne_h[j] = Math.max(ne_h[j], h);
    				}
    			}else if(xl >= 0){
    				for(int j = xl;j < xr;j++){
    					po_h[j] = Math.max(po_h[j], h);
    				}
    			}else{
    				for(int j = 0;j < -xl;j++){
    					ne_h[j] = Math.max(ne_h[j], h);
    				}
    				for(int j = 0;j < xr;j++){
    					po_h[j] = Math.max(po_h[j], h);
    				}
    			}
    		}
    	}
    	void check(){
    		for(int i = 0;i < 21;i++){
    			System.out.print(ne_h[i]);
    		}
    		System.out.println();
    		for(int i = 0;i < 21;i++){
    			System.out.print(po_h[i]);
    		}
    		System.out.println();
    		System.out.println();
    	}
    	double ans(int r){
    		double result = 10000;
    		for(int i = 0;i < r;i++){
    			double line = Math.min(ne_h[i], po_h[i]);
    			double high = (double)r - Math.sqrt((double)(r * r - i*i));
    			line = line + high;
    			result = Math.min(result, line);
//    			System.out.println(i+"??????:"+result+" "+high+" "+line);
    		}
    		return result;
    	}
    	void doIt(){
     		while(true){
     			int r = sc.nextInt();
     			int n = sc.nextInt();
     			if(r + n == 0)break;
     			clear();
     			bar(n);
//     			check();
     			System.out.printf("%.4f\n",ans(r));
     		}
    	}
    }
}