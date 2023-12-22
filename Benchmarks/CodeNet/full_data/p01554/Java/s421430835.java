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
    		int n = sc.nextInt();
    		ArrayList<String> array = new ArrayList<String>();
    		for(int i = 0;i < n;i++){
    			array.add(sc.next());
    		}
    		int m = sc.nextInt();
    		boolean open = true;
    		for(int i = 0;i < m;i++){
    			String str = sc.next();
    			if(array.contains(str)){
    				if(open){
    					System.out.println("Opened by "+str);
    					open = false;
    				}else{
    					System.out.println("Closed by "+str);
    					open = true;
    				}
    			}else{
    				System.out.println("Unknown "+str);
    			}
    		}
    	}
    }
}