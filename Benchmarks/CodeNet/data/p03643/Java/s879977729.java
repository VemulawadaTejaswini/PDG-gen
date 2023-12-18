import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int a = scan.nextInt();
      	int counter = 0;
      	int x = 0;
      	int num = 0;
      	while(x < a){
        	x = 2^(num);
          	num++;
        }
      	while(a % 2 != 0){
        	if(a % 2 == 0){
            counter++;
            a = a / 2;
            }
        }
      	if(num > counter){
      		System.out.print(num);
      	}
      	else {
      		System.out.print(counter);
      	}
      	
    }
}