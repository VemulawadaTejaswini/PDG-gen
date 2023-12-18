

import java.util.LinkedList;

import java.util.Queue;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String S = sc.next();
	    sc.close();
	    
	    Queue <Character> Q = new LinkedList <Character>();
	    int length = S.length();
	    for (int i=0; i<length; i++){
	    	Q.add(S.charAt(i));
	    }
	    
	    
	  	int check = 0;
	  	char next = Q.poll();
	    while (Q.isEmpty()!=true && next!='k'){
	    	next = Q.poll();
	    }
	    
	    if (Q.isEmpty()) {
	    	System.out.println("NO");
	    	check=-1;
	    }
	    
	    else {
	    	next = Q.poll();
	    
	    	if (next!='e'){
	    		check++;
	    		while (Q.isEmpty()!=true && next!='e'){
	    			next = Q.poll();
	    		}
	    	}
	    
	    	if (Q.isEmpty()) {
	    		System.out.println("NO");
	    		check=-1;
	    	}
	    	
	    	else {
	    
	    		next = Q.poll();
	    	
	    		if (next!='y'){
	    			check++;
	    			while (Q.isEmpty()!=true && next!='y'){
	    				next = Q.poll();
	    			}
	    		}
	    
	    
	    		if (Q.isEmpty()) {
	    			System.out.println("NO");
	    			check=-1;
	    		}
	    		
	    		else {
	    			next = Q.poll();
	    
	    			if (next!='e'){
	    				check++;
	    				while (Q.isEmpty()!=true && next!='e'){
	    					next = Q.poll();
	    				}
	    			}
	     
	  			if (Q.isEmpty()) {
	  				System.out.println("NO");
	  				check=-1;
	  			}
	    
	  			else {
	    	
	  				next = Q.poll();
	    
	  				if (next!='n'){
	  					check++;
	  					while (Q.isEmpty()!=true && next!='n'){
	  						next = Q.poll();
	  					}
	  				}
	    
	  				if (Q.isEmpty()) {
	  					System.out.println("NO");
	  					check=-1;
	  				}	
	    
	  				else {
	    	
	  					next = Q.poll();
	    
	  					if (next!='c'){
	  						check++;
	  						while (Q.isEmpty()!=true && next!='c'){
	  							next = Q.poll();
	  						}
	  					}
	    
	  					if (Q.isEmpty()) {
	  						System.out.println("NO");
	  						check=-1;
	  					}
	  					
	  					else {
	  						next = Q.poll();
	    
	  						if (next!='e'){
	  							check++;
	  							while (Q.isEmpty()!=true && next!='e'){
	  								next = Q.poll();
	  							}
	  						}
	  					}
	  				}
	  			}
	    		}
	    	}
	    }
	    
	    //System.out.println(check);
	    
	    if (check>1)
	    	System.out.println("NO");
	    
	    else if (check == -1) {
	    }
	    
	    else if (next!='e')
	    	System.out.println("NO");
	    
	    else
	    	System.out.println("YES");
	}
}
