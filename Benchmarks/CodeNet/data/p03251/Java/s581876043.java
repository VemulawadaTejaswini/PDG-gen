import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] arr_x = new int[100];
      	int[] arr_y = new int[100];
      	int war_x = 0;
      	int war_y = 0;
         
      for(int i = 0; i<n ; ++i){
        arr_x[i] = sc.nextInt();    
      }       
      for(int i = 0; i<m ; ++i){
       arr_y[i] = sc.nextInt(); 
      }
      if(x>y){
        System.out.println("War");
      } else{
        for(int Z = x+1; Z < y+1 ; Z++){
        	for(int i = 0; i<n ; i++){
               	if(arr_x[i] < Z){
            		war_x++;
                }
            }
          	if(war_x==n){
            	for(int j = 0; j<m ; j++){
                 if(arr_y[j]>=Z){
              		war_y++;
                 }
                }
              	if(war_y==m){
                  System.out.println("No War");
                  return;
                } else {
                  war_y = 0;
                }
            } else {
              	war_x=0;
         	}	
        }
        System.out.println("War");
      }
    }
}