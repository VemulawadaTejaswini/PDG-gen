import java.util.*;

public class Main { 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numlist[] = new int[5];
		int k;
        int result = 0;
        
      	for(int i=0;i<5;i++){
         	numlist[i] = sc.nextInt(); 
        }
      	k = sc.nextInt();
      	for(int i=0;i<4;i++){
         	if((numlist[i+1] - numlist[i])==2){
            	result = 1;
				break;
            }
        }
      	if(result == 0){
          	System.out.println("Yay!");
        }else{
         	System.out.println(":(");
        }
          
    }
}
