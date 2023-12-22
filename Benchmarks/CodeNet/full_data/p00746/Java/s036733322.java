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
    	class Par{
    		int sw,sh,ew,eh;
    		public Par(int sw,int sh,int ew,int eh){
    			this.sw = sw;
    			this.sh = sh;
    			this.ew = ew;
    			this.eh = eh;
    		}
    	}
    	void doIt(){
    		while(true){
    			ArrayList<Par> array = new ArrayList<Par>();
    			int n = sc.nextInt();
    			if(n == 0)break;
    			array.add(new Par(0,0,1,1));
    			int sw = 0,sh = 0,ew = 1,eh = 1;
    			for(int i = 1;i < n;i++){
    				int num = sc.nextInt();
    				int side = sc.nextInt();
    				Par p = array.get(num);
    				int mw = 0,mh = 0;
    				if(side == 0){
    					mw = -1;
    					mh = 0;
    				}else if(side == 1){
    					mw = 0;
    					mh = -1;
    				}else if(side == 2){
    					mw = 1;
    					mh = 0;
    				}else{
    					mw = 0;
    					mh = 1;
    				}
    				array.add(new Par(p.sw+mw,p.sh+mh,p.ew+mw,p.eh+mh));
    				sw = Math.min(sw, p.sw+mw);
    				sh = Math.min(sh, p.sh+mh);
    				ew = Math.max(ew, p.ew+mw);
    				eh = Math.max(eh, p.eh+mh);
    			}
    			System.out.println((ew - sw)+" "+(eh - sh));
    		}
    	}
    }
}