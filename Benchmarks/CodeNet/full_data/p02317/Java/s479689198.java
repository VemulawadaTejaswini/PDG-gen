import java.util.*;
 
public class Main {
    Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
    	new Main(); 
    }
 
    public Main() {
    	new DPL4().doIt();
    }
    class DPL4{
    	ArrayList<Integer> array = new ArrayList<Integer>();
    	int bsp(int num){
    		int first = 0;
    		int last = array.size()-1;
    		int mid = 0;
    		if(first < last)mid = first / last;;
    		if(array.get(last) < num)return array.size();
    		while(last - first > 1){
    			if(array.get(mid) < num){
    				first = mid;
    				mid = (mid + last)/2;
    			}
    			else{
    				last = mid;
    				mid = (mid + first)/2;
    			}
    		}
    		if(array.get(first) > num)return first;
    		else return last;
    	}
    	void doIt(){
    		int n = sc.nextInt();
    		for(int i = 0;i < n;i++){
    			int num = sc.nextInt();
    			if(array.size() == 0)array.add(num);
    			else{
    				int pos = bsp(num);
    				if(pos == array.size())array.add(num);
    				else array.set(pos,num);
    			}
    		}
    		System.out.println(array.size());
    	}
    }
}