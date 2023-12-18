import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int[][] card = new int[3][3];
    for(int i=0; i<3; i++){
    	for(int j=0; j<3; j++){
        	card[i][j] = sc.nextInt();
        }
    }
    int N = sc.nextInt();
    int[] number = new int[N];
    for(int i=0; i<N; i++){
    	number[i] = sc.nextInt();
    }
    
    for(int i=0; i<3; i++){
		for(int j=0; j<3; j++){
        	for(int k=0; k<N; k++){
            	if(card[i][j] == number[k]){
                	card[i][j] =0;
                    break;
                }
            }
        }    
    }
    boolean judge = false;
    	for(int i=0; i<3; i++){
    		if(card[i][0] ==0 && card[i][1] == 0 && card[i][2] == 0){
    			judge = true;
        		break;
           }
    }
    if(judge == false){
    	for(int i=0; i<3; i++){
            if(card[0][i] == 0 && card[1][i] == 0 && card[2][i] == 0){
              	judge = true;
                break;
            }
    	}   
    }
    if(judge == false){
    	if(card[0][0] == 0 && card[1][1] ==0 && card[2][2] == 0){
        	judge = true;
        }
    }
    if(judge == false){
      if(card[0][2] == 0 && card[1][1] == 0 && card[2][0] == 0){
        judge = true;
      }
    }
    String ans = "";
     if(judge == true) ans ="Yes";  else ans = "No";
     
    System.out.println(ans);
    
    
  }
}
