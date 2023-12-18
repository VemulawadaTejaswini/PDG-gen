import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	int min1 = a;
      	int min2 = b;
      	int pointer1 = a;
      	int pointer2 = b;
      	sc.close();
      	for(int i = a; i <= b; i ++){
          	if(min1 > (i % 2019)){
            	min1 = (i % 2019);
              	pointer1 = i;
            }
          	if(min1 == 0){
            	break;
            }
        }
      	for(int i = a; i <= b; i ++){
          	if(min1 != 0 ){
          	if(i != pointer1){
              if(min2 > (i % 2019)){
            	min2 = (i % 2019);
              	pointer2 = i;
            }
            }
            }
          	else{
            	break;
            }
          	
        }
      	System.out.print((pointer1 * pointer2) % 2019);
    }
 
}