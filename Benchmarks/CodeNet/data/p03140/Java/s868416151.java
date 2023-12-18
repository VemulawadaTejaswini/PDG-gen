import java.util.*;

class Main{
    public static boolean isAllTrue(ArrayList<Boolean> mlist){
        for(int i = 0; i < mlist.size(); i++) {
            if(!mlist.get(i)) {
                return false;
                
            }
            
        }
        
        return true;
        
    }
        
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        
        int n = 0;
        String a = "";
        String b = "";
        String c = "";
        
        for(int i = 0; cin.hasNext(); i++){
	        String line = cin.nextLine();
	        
	        if(i == 0) {
	            n = Integer.parseInt(line);
	            
	        } else if(i == 1) {
	            a = line;
	            
	        } else if(i == 2) {
	            b = line;
	            
	        } else if(i == 3) {
	            c = line;
	            
	        } else {
	            
	        }
	        
        }
        
        ArrayList<Boolean> mlist = new ArrayList<Boolean>();
        
        for(int i = 0; i < n; i++) {
            mlist.add(false);
            
        }
        
        int res = 0;
        int cnt = 0;
        int pres = -1;
        
        boolean flg = false;
        
        while(!isAllTrue(mlist)) {
            if(pres == res) {
                flg = true;
                
            } else {
                
            }
                
            pres = res;
            
            for(int i = 0; i < n; i++) {
                String _a = a.substring(i, i + 1);
                String _b = b.substring(i, i + 1);
                String _c = c.substring(i, i + 1);
                
                if(mlist.get(i)) {
                    
                } else {
                    if(_a.equals(_b) && _a.equals(_c)) {
                        mlist.set(i, true);
                        cnt++;
                        
                    } else if(_a.equals(_b) || _a.equals(_c)) {
                        mlist.set(i, true);
                        cnt++;
                        res++;
                        
                    } else if(_b.equals(_c)) {
                        mlist.set(i, true);
                        cnt++;
                        res++;
                        
                    } else {
                        if(flg) {
                            mlist.set(i, true);
                            cnt++;
                            res += 2;
                            flg = false;
                            
                        }
                        
                    }
                    
                }
                
            }
        
        }
        
        
        System.out.println(res);
        
    }
    
}
