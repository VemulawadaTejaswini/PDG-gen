import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args){
    int H=1;
    int W=1;
    int num=0;
    ArrayList<Integer> Hr = new ArrayList<Integer>();
    ArrayList<Integer> Wr = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in); 
    while(H!=0&&W!=0){
    	H = sc.nextInt();
    	W = sc.nextInt();
   if(H>300||H<1){
	   continue;
   }
   else if(W>300||W<1){
	   continue;
   }
    	Hr.add(H);
    	Wr.add(W);
    	num++;
    	
    }
    
    for(int i=0;i<num;i++){
    	for(int h=0;h<Hr.get(i);h++){
    		for(int w=0;w<Wr.get(i);w++){
    			if(h%2==0){
    			if(w%2==0){	
    				System.out.print("#");
    				}
    			else{
    				System.out.print(".");
    			}
    			}
    			else{
    				if(w%2==0){	
        				System.out.print(".");
        				}
        			else{
        				System.out.print("#");
        			}
    			
    		}
    		
    		
    		
    	}
    	System.out.println();
    	
    	
    }
	System.out.println();
    }
}
}