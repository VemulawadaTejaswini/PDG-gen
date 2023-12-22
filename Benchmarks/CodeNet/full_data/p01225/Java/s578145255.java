import java.util.Scanner;


//==============================================================================

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int[][] tehuda = new int[2][9];
        
        int T = sc.nextInt();//???????????????????????°
        
        for( int i = 0 ; i < T ; i++ ){//???????????????????????°?????????
            for( int j = 0 ; j < 2 ; j++ ){
                for( int k = 0 ; k < 9 ; k++ ){
                    
                    if( j == 0 ){
                        tehuda[i][j] = sc.nextInt();
                    }else{
                        char color = sc.next().charAt(0);
                        int intColor = 0;
                        if( color == 'R'){//R???????????¨??????
                            intColor = 11;
                        }else if( color == 'G'){//G???????????¨??????
                            intColor = 12;
                        }else if( color == 'B'){//B???????????¨??????
                            intColor = 13;
                        }
                        
                        tehuda[i][j] = intColor;
                    }
                }
            }
        
        
            Rummy insRummy = new Rummy();//Rummy???????????????
        
            insRummy.setCard(tehuda);//??????????????°??¨??????Rummy????????????setCard???
            
            insRummy.sort();//Rummy????????????sort??????????????????
            
            tehuda = insRummy.getCard();//sort??????????????????????????????
            
            int count = 0;//?????????????????????
            count = insRummy.judge(tehuda);
            
            if( count >= 3 ){
                System.out.println(1);
 
            }else{
                System.out.println(0);
            }
        }
    }

//==============================================================================

	static class Rummy {
	    
	    private int[][] tehuda = new int[2][9];
	    
	    Rummy(){
	        
	    }
	
	    public int judge(int[][] tehuda) {
	        
	    	int count = 0;
	        
	        for(int i= 0; i < 7; i++){//??£????????§??????
	            
	            for(int j = i+1; j < 8; j++ ){
	               
	                for(int k = j+1; k < 9; k++){
	                    
	                   if(tehuda[1][i] == tehuda[1][j] && tehuda[1][j] == tehuda[1][k]){
	                        
	                        if(tehuda[0][i] != 0 && tehuda[0][i] == tehuda[0][j] -1 && tehuda[0][i] == tehuda[0][k] -2){
	                        	
	                        	count++;
	                           
	                        	tehuda[0][i] = 0;//?????´???????????????0???
	                        	tehuda[0][j] = 0;//?????´???????????????0???
	                        	tehuda[0][k] = 0;//?????´???????????????0???
	                        }
	                    }
	
	                }
	            }
	        }
	        
	       
	        for(int i= 0; i < 7; i++){//?????????????????§??????
	            
	            for(int j = i+1; j < 8; j++ ){
	                
	                for(int k = j+1; k < 9; k++){
	                    
	                    if(tehuda[1][i] == tehuda[1][j] && tehuda[1][j] == tehuda[1][k]){
	                       
	                        if(tehuda[0][i] != 0 && tehuda[0][i] == tehuda[0][j] && tehuda[0][i] == tehuda[0][k]){
	                        	
	                        	count++;
	                           
	                        	tehuda[0][i] = 0;//?????´???????????????0???
	                        	tehuda[0][j] = 0;//?????´???????????????0???
	                        	tehuda[0][k] = 0;//?????´???????????????0???
	                        }
	                    }
	                }
	            }
	        }
	        return count;
	    }
	    
	    public void sort() {
	        
	    	for(int i = 0; i < 8; i++){//??????????????????
	            for(int j = 0; j < 8-i; j++ ){
	
	                if(tehuda[1][j] > tehuda[1][j+1]){
	                    int temp = tehuda[1][j];
	                    tehuda[1][j] = tehuda[1][j+1];
	                    tehuda[1][j+1] = temp;
	                    
	                    int temp2 = tehuda[0][j];
	                    tehuda[0][j] = tehuda[0][j+1];
	                    tehuda[0][j+1] = temp2;
	                }
	            }
	        }
	        
	        for(int i = 0; i < 8; i++){//??????????????????
	
	            for(int j = 0; j < 8-i; j++){
	                
	                if(tehuda[1][j] == tehuda[1][j+1] && tehuda[0][j] > tehuda[0][j+1]){
	
	                    int temp = tehuda[0][j];
	                    tehuda[0][j] = tehuda[0][j+1];
	                    tehuda[0][j+1] = temp;
	                    
	                }
	            }
	        }
	    }
	
	    public void setCard(int[][] tehuda) {
	        this.tehuda = tehuda;
	        
	    }
	    
	    public int[][] getCard() {
	         return tehuda;
	    }
	}
}