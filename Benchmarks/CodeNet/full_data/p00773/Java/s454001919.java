import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
    	new Main(); 
    }
 
    public Main() {
    	new A().doIt();
    }
    class A{
    	void doIt(){
    		while(true){
    			int x = sc.nextInt();
    			int y = sc.nextInt();
    			int s = sc.nextInt();
    			if(x + y + s == 0)break;
    			int length = (s / 2)+1;
    			int max = 0;
    			for(int i = 1;i < length;i++){
    				int low = (i * 100)/(100+x);
    				int high = ((s-i) * 100)/(100+x);
    				if((i * 100) % (100+x) != 0){
    					low += 1;
    				}
    				if(((s-i) * 100) % (100+x) != 0){
    					high += 1;
    				}
    				if((low * (100 + x))/100 != i)continue;
    				if((high* (100 + x))/100 != (s-i))continue;
//    				System.out.print(low+" "+high);
    				low = (low * (100 + y))/100;
    				high = (high * (100 + y))/100;
    				max = Math.max(max,low+high);
//    				System.out.println(" "+(low+high));
    			}
    		System.out.println(max);
    		}
    	}
    }
}