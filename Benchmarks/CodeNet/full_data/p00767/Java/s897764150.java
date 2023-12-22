import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new B().doIt();
    }
    class B{
    	class map{
    		int h,w,S;
    		public map(int h,int w,int S){
    			this.h = h;
    			this.w = w;
    			this.S = S;
    		}
    	}
        void doIt(){
        	ArrayList<map> array = new ArrayList<map>();
    		for(int i = 1;i < 152;i++){
    			for(int j = i+1;j < 152;j++){
    				array.add(new map(i,j,(i*i) + (j*j)));
    			}
    		}
    		int length = array.size();
    		for(int i = 1;i < length;i++){
    			for(int j = i;j > 0;j--){
    				if(array.get(j).S  < array.get(j-1).S){
    					map m = array.get(j);
    					array.set(j, array.get(j-1));
    					array.set(j-1, m);
    				}
    				else if(array.get(j).h < array.get(j-1).h){
    					map m = array.get(j);
    					array.set(j, array.get(j-1));
    					array.set(j-1, m);
    				}else break;
    			}
    		}
        	while(true){
        		int h = sc.nextInt();
        		int w = sc.nextInt();
        		if(h+w == 0)break;
        		map m = new map(h,w,(h*h) + (w*w));
        		for(int i = 0;i < length;i++){
        			if(array.get(i).h == m.h && array.get(i).w == m.w){
        				System.out.println(array.get(i+1).h+" "+array.get(i+1).w);
        				break;
        			}
        		}
        	}
        }
    }
}