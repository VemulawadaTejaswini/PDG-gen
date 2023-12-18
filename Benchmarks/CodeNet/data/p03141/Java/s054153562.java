import java.util.*;

class Main{
    public static int getMax(ArrayList<Integer> ablist) {
        int max = 0;
        
        for(int i = 0; i < ablist.size(); i++) {
            if(max < ablist.get(i)) {
                max = ablist.get(i);
                
            }
            
        }
        
        return max;
        
    }
    
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        
        int n = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        
        for(int i = 0; cin.hasNext(); i++){
	        String line = cin.nextLine();
	        
	        if(i == 0) {
	            n = Integer.parseInt(line);
	            
	        } else  {
	            String[] ab = line.split(" ", 0);
	            
	            a.add(Integer.parseInt(ab[0]));
	            b.add(Integer.parseInt(ab[1]));
	            
	        }
	        
        }
        
        int cnt = 0;
        int res = 0;
        
        while(cnt < n) {
            int amax = getMax(a);
            int bmax = 0;
            int bmaxi = 0;
            
            for(int i = 0; i < n; i++) {
                if(amax == a.get(i)) {
                    if(bmax < b.get(i)) {
                        bmax = b.get(i);
                        bmaxi = i;
                        
                    }
                    
                } else {
                    
                }
                
            }
            
            res += a.get(bmaxi);
            a.set(bmaxi, 0);
            b.set(bmaxi, 0);
            cnt++;
            
            bmax = getMax(b);
            amax = 0;
            int amaxi = 0;
            
            
            if(cnt < n) {
                for(int i = 0; i < n; i++) {
                    if(bmax == b.get(i)) {
                        if(amax < a.get(i)) {
                            amax = a.get(i);
                            amaxi = i;
                        
                        }
                    
                    } else {
                        
                    }
                
                }
            
            }
            
            res -= b.get(amaxi);
            a.set(amaxi, 0);
            b.set(amaxi, 0);
            cnt++;
            
        }
        
        System.out.println(res);
        
    }
    
}
