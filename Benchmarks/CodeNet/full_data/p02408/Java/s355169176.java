import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		StringBuilder out = new StringBuilder();
        int all = scan.nextInt();
		
		int[][] hako = new int[5][14];
		
        for(int i = 1; i <= 4; i++){
        	for(int j = 1; j <= 13; j++){
        		hako[i][j] = j;
        	}
        }
        
        for(int i = 1; i <= all; i++){
        	String op = scan.next();
        	int n = scan.nextInt();
        	
        	if(op.equals("S")){
        		for(int j = 1; j <= 13; j++){
        			if(hako[2][j] == n){
        				hako[2][j] = 0;
        			}//if
        		}//for
        	}//if
        	
        	if(op.equals("H")){
        		for(int j = 1; j <= 13; j++){
        			if(hako[3][j] == n){
        				hako[3][j] = 0;
        			}//if
        		}//for
        	}//if
        	
        	if(op.equals("D")){
        		for(int j = 1; j <= 13; j++){
        			if(hako[4][j] == n){
        				hako[4][j] = 0;
        			}//if
        		}//for
        	}//if
        	
        	if(op.equals("C")){
        		for(int j = 1; j <= 13; j++){
        			if(hako[1][j] == n){
        				hako[1][j] = 0;
        			}//if
        		}//for
        	}//if
        	
        }//for
        
        for(int i = 1; i <= 13; i++){
        	for(int j = 1; j < 13; j++){
        		if(hako[i][j] != 0){
        			out.append( "S " + hako[i][j]);
        		}
        		if(hako[i][j] != 0){
        			out.append( "H " + hako[i][j]);
        		}
        		if(hako[i][j] != 0){
        			out.append( "D " + hako[i][j]);
        		}
        		if(hako[i][j] != 0){
        			out.append( "C " + hako[i][j]);
        		}//if
        	}//for
        }//for
        
        System.out.println(out);
	}	
}