import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());  //?????£??????????????????????????°?????\????????????
	    String[] cards ;
	    
   //??¨???????????????????¨????????????¶?????????????????????????????????.
	    Boolean[] S = new Boolean[13];
	    Boolean[] H = new Boolean[13];
	    Boolean[] C = new Boolean[13];
	    Boolean[] D = new Boolean[13];
	    
	    for(int i = 0; i < 13 ; i++) {
	    	S[i] = false ;
	    	H[i] = false ;
	    	C[i] = false ;
	    	D[i] = false ;
	    }
	
	//?????£??????????????????????????¨???????????????????¨?????????\???????????????????????????
	    for(int j = 0 ; j < n ; j ++) {
	    	cards = br.readLine().split(" ");
	    	int x = Integer.parseInt(cards[1]);
	    	
	//??????????????¶????????????????????????   	
	    	switch(cards[0].charAt(0)){
	    	      case 'S' : S[x-1] = true ; break ;
	    	      case 'H' : H[x-1] = true ; break ;
	    	      case 'C' : C[x-1] = true ; break ;
	    	      case 'D' : D[x-1] = true ; break ;
	    	}
	    }
	 
	//4?¨???????????????????????????£????????????????????????????????????????????????????????????    
	    int j = 0 ;
	    while( j < 4) {
	    	for(int i = 0; i < 13 ; i++) {
	    		switch(j) {
	    		      case 0 : if( S[i] == false ) 
	    		       System.out.println("S" + " " + (i+1)); break ;
	    		      case 1 : if( H[i] == false ) 
   		    	       System.out.println("H" + " " + (i+1)); break ;
	    		      case 2 : if( C[i] == false ) 
   		    	       System.out.println("C" + " " + (i+1)); break ;
	    		      case 3 : if( D[i] == false ) 
   		    	       System.out.println("D" + " " + (i+1)); break ;
	    		}
	    	}
	    	j++;
	    }