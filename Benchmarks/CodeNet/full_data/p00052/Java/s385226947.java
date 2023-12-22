
import java.awt.geom.Point2D;
import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        new Main(); 
    }
 
    public Main() {
    	new aoj0052().doIt();
    }
    class aoj0052{
    	void doIt(){
    		int a[] = new int [20001];
    		int num[] = {1,5,25,125,625,3125,15625};
    		for(int i = 1;i < 20001;i++){
    			for(int j = 6;j >= 0;j--){
    				if(i % num[j] == 0){
    					a[i] = a[i-1] + j;
    					break;
    				}
    			}
    		}
    		while(true){
    			int n = sc.nextInt();
    			if(n == 0)break;
    			System.out.println(a[n]);
    		}
    	}
    }
}