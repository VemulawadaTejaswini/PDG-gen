import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int R = scan.nextInt();
      	int G = scan.nextInt();
      	int B = scan.nextInt();
      	int N = scan.nextInt();
      	int counter = 0;
      	int k = N;
      	for(int i=0; i <= N/R; i++){//i<=4 i++
        	k = N - R*i;//k=4,3,2,1,0
          	for(int j= 0; j <= k/G;j++){
            	int c = k -G*j;//c=4,2,
             	if(c%B == 0){
                	counter++;
                }
            }
        }
      	System.out.print(counter);
    }

}