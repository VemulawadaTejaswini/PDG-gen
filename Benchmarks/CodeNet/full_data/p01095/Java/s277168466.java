import java.util.*;
 
class Main {
	
	static List<Integer> data=new ArrayList<>();
	static boolean jd=true;
	
    public static void main(String[] args) {
         
        Scanner cin=new Scanner(System.in);
        while(true) {
        	
        	int m=cin.nextInt(),n=cin.nextInt();
        	if(n==0)break;
        	
        	
        	data.add(m);
        	int c=1,i=m+1;
        	
        	while(c!=n+1) {
        		jd=true;
        		solve(i,0);
        		/*for(int j=0;j<data.size();j++) {
        			if(data.get(j)*2 >i)break;
        			else if(i%data.get(j)==0) {
        				jd=false;
        				break;
        			}
        		}*/
        		
        		if(jd) {
        			data.add(i);
        			//System.out.println(i+"=newTAKE");
        			c++;
        		}
        		i++;
        	}
        	
        	System.out.println(data.get(data.size()-1));
        	
        	
        }
        
    }
    
    static void solve(int i,int j) {
    	if(data.get(j)>i/2)return;
    	else if(i%data.get(j)==0) {
    		jd=false;
    		return;
    	}
    	else {
    		if(j<data.size()-1)solve(i,j+1);
    	}
    	
    }
}
