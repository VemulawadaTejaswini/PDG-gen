import java.util.ArrayList;
import java.util.Scanner;
 
public class Main{
 
    public static void main(String[] args) {
       
    	Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
 
        ArrayList< int[] > diceList = new ArrayList< int[] >();
 
        for(int i = 0; i < n; i++){
            
            int[] dice = new int[6];
            
            for( int j = 0 ; j < 6 ; j++ ){
 
                dice[j] = scan.nextInt();
                
            }
           
            diceList.add(dice);
            
        }
 
       
        int[] dice1 = new int[6];
        int[] dice2 = new int[6];
       
        boolean hantei = false;
        
        int Count = 0;
 
        for(int i = 0 ; i < n ; i++ ){
        	for(int j = 0 ; j < n ; j++ ){
 
                dice1 = diceList.get(j);
                dice2 = diceList.get(i);
 
                
                Dice insDice = new Dice( dice1 , dice2 );
 
               
                if( i != j ){
                	
                	hantei = insDice.judge( dice1 , dice2 );
                    
                }
                
                
                if( hantei ){
                	
                    Count++;
                    
                }
            }
 
        }
 
        if( Count == 0 ){
        	
            System.out.println("Yes");
            
        }else{
        	
            System.out.println("No");
            
        }
 
    }
 
//------------------------------------------------------------------------------
    
    static class Dice {
 
        
        int[] dice1 = new int[6];
        int[] dice2 = new int[6];
        boolean hantei = false;
        
        //public Dice(){
       // }
 
        public Dice(int[] dice, int[] dice2){
        	
            this.dice1 = dice;
            this.dice2 = dice2;
            
        }
 
        public boolean judge(int[] dice, int[] dice2){
        	
        	int Count = 0;
 
        	for(int x = 0; x < 4; x++){
                for(int y = 0; y < 4; y++){
                	for(int z = 0; z < 4; z++){
                		
                		Count = 0;
                		
                        for(int i =0; i < dice.length; i++){
 
                        	if( dice[i] == dice2[i] ){
                                
                                Count++;
                                
                            }
                           
                            if( Count == 6 ){
                                
                            	hantei = true;
                            	
                            }
                        }
                        
                        int temp = dice[1];
                        dice[1] = dice[2];
                        dice[2] = dice[4];
                        dice[4] = dice[3];
                        dice[3] = temp;
 
                    }
                    
                    roll("S");
                }
               
                roll("E");
            }
            
            return hantei;
        }
 
 
 
 
        
        public void roll(String houkou){
 
            int kari = 0;
            
            if("S".equals(houkou)){
 
            	kari = dice1[0];
                dice1[0] = dice1[4];
                dice1[4] = dice1[5];
                dice1[5] = dice1[1];
                dice1[1] = kari;
                
            }else if("E".equals(houkou)){
 
            	kari = dice1[0];
                dice1[0] = dice1[3];
                dice1[3] = dice1[5];
                dice1[5] = dice1[2];
                dice1[2] = kari;
                
            }else if("W".equals(houkou)){
 
            	kari = dice1[0];
                dice1[0] = dice1[2];
                dice1[2] = dice1[5];
                dice1[5] = dice1[3];
                dice1[3] = kari;
                
            }else if("N".equals(houkou)){
 
            	kari = dice1[0];
                dice1[0] = dice1[1];
                dice1[1] = dice1[5];
                dice1[5] = dice1[4];
                dice1[4] = kari;
                
            }
        }
    }
}