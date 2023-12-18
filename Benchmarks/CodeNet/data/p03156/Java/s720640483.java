import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String line;
        int n = 0;
        int a = 0;
        int b = 0;
        ArrayList<Integer> p = new ArrayList<Integer>();
        
        for(int i = 0; cin.hasNext(); i++){
	        line = cin.nextLine();
	        
	        if(i == 0) {
	            n = Integer.parseInt(line);
	            
	        } else if(i == 1) {
	            String[] ab = line.split(" ", 0);
	            
	            for(int j = 0; j < 2; j++) {
	                if(j == 0) {
	                    a = Integer.parseInt(ab[j]);
	                    
	                } else if(j == 1) {
	                    b = Integer.parseInt(ab[j]);
	                    
	                } else {
	                    
	                }
	                
	            }
	            
	        } else if(i == 2) {
	            String[] ps = line.split(" ", 0);
	            
	            for(int j = 0; j < ps.length; j++) {
	                p.add(Integer.parseInt(ps[j]));
	                
	            }
	            
	        } else {
	            
	        }
	        
        }
        
        int s = 0;
        int m = 0;
        int l = 0;
        
        for(int i = 0; i < p.size(); i++) {
            if(p.get(i) <= a) {
                s++;
                
            } else if(p.get(i) > a && p.get(i) <= b) {
                m++;
                
            } else if(p.get(i) > b) {
                l++;
                
            }
            
        }
        
        int min = s;
        
        if(min > m) {
            min = m;
        }
        
        if(min > l) {
            min = l;
            
        }
        
        System.out.println(min);
        
    }
    
}
