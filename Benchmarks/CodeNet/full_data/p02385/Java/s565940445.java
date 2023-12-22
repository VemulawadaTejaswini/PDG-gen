import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        
        Dice dice = new Dice();
        
        for(int i = 0 ; i < 6 ; i ++){
        	
            dice.dice1[i]=scan.nextInt();
            
        }
        
        for(int i = 0 ; i < 6 ; i ++){
        	
            dice.dice2[i]=scan.nextInt();
            
        }
        
        dice.check();
    }
}
class Dice{
	
    public int[] dice1 = new int[6];
    public int[] dice2 = new int[6];
    private int kari = 0;
    
    void check(){
    	
        for(int i = 0 ; i <= 3 ; i ++){
            if(checkAll()){
                break;
            }
            
            N();
            
            for(int j = 0 ; j <= 3 ; j ++){
                if(checkAll()){
                    break;
                }
                
                R();
                
            }
        }
        
        for(int j = 0 ; j <= 3 ; j ++){
            if(checkAll()){
                break;
            }
            
            W();
            
            for(int i = 0 ; i <= 3 ; i ++){
                if(checkAll()){
                    break;
                }
                
                R();
                
            }
        }
        
        if(Arrays.equals(dice1,dice2)){//Arraysクラスequalsで配列比較
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
    
    
    boolean checkAll(){
        if(dice1[0] == dice2[0] && dice1[1] == dice2[1] && dice1[2] == dice2[2] &&
        		dice1[3] == dice2[3] && dice1[4] == dice2[4] && dice1[5] == dice2[5]){
            return true;
        }
        return false;
    }
    
    
    
    void N(){
    	kari=dice1[0];
    	dice1[0]=dice1[1];
    	dice1[1]=dice1[5];
    	dice1[5]=dice1[4];
    	dice1[4]=kari;
    }
    
    void S(){
    	kari=dice1[0];
    	dice1[0]=dice1[4];
    	dice1[4]=dice1[5];
    	dice1[5]=dice1[1];
    	dice1[1]=kari;
    }
    
    void E(){
    	kari=dice1[0];
    	dice1[0]=dice1[3];
    	dice1[3]=dice1[5];
    	dice1[5]=dice1[2];
    	dice1[2]=kari;
    }
    
    void W(){
    	kari=dice1[0];
    	dice1[0]=dice1[2];
    	dice1[2]=dice1[5];
    	dice1[5]=dice1[3];
    	dice1[3]=kari;
    }
    
    void R(){//0と5は動かさずロールさせる
    	kari=dice1[1];
    	dice1[1]=dice1[2];
    	dice1[2]=dice1[4];
    	dice1[4]=dice1[3];
    	dice1[3]=kari;
    }
}