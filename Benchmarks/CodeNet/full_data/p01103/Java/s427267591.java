import java.util.*;
 
class Main {
    
	static int res=0,d,w,E[][]=new int[10][10];
	
    public static void main(String[] args) {
         
       Scanner cin=new Scanner(System.in);
       
       while(true) {
    	   d=cin.nextInt();w=cin.nextInt();
    	   if(d==0)break;
    	   res=0;
    	   for(int i=0;i<d;i++) {
    		   for(int j=0;j<w;j++)E[i][j]=cin.nextInt();
    	   }
    	   solve(3,3);
    	   System.out.println(res);
       }  
    }
    
    static void solve(int y,int x){
    	
    	
    	for(int a=0;a<=d-y;a++) {
    		for(int b=0;b<=w-x;b++) {
    			int Emin=10,Imax=0;
    			for(int i=a;i<a+y;i++) {
    	    		for(int j=b;j<b+x;j++) {
    	    			
    	    			//System.out.print(y+" "+x+" "+i+" "+j+" "+E[i][j]+" ");
    	    			if(i==a || i==a+y-1 || j==b || j==b+x-1) {
    	    				//System.out.print("E");
    	    				Emin=Math.min(E[i][j], Emin);
    	    			}
    	    			else {
    	    				//System.out.print("I");
    	    				Imax=Math.max(E[i][j], Imax);
    	    			}
    	    			
    	    			//System.out.println();
    	    		}
    	    	}
    			if(Imax<Emin) {
    				int cap=0;
    				for(int i=a+1;i<a+y-1;i++) {
    					for(int j=b+1;j<b+x-1;j++)cap+=Emin-E[i][j];
    				}
    				res=Math.max(cap, res);
    			}
    	    	//else System.out.println(y+" "+x+" "+a+" "+b+" "+Emin+" "+Imax+" "+"NO SPACE");
    			//System.out.println();
    			
    		}
    	}
    	
    	
    	
    	if(y<d)solve(y+1,x);
    	if(x<w)solve(y,x+1);
    }
}
