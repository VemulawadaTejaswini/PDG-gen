import java.util.Scanner;
class Task{
	public static void main(String args[]){
    	Scanner in = new Scanner(System.in);
      	int cnt = 1;
      	while(cnt<6){
        	int x = in.nextInt();
          	if(x == 0){
            	System.out.println(cnt);
              	return;
            }
          	cnt++;
        }
    }
 
}