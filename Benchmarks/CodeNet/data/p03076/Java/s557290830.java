import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int[] numbers = new int[5];
      	int lastdish = 0;
      	for(int i=0;i<5;i++){
        	numbers[i] = scan.nextInt();
        }
      	for(int i=0;i<5;i++){
        	if(numbers[i]%10 !=0 && resi(numbers[i]) < resi(numbers[lastdish])){
            	lastdish = i;
            }
        }
      	int time = 0;
      	for(int i = 0;i<5;i++){
        	if(i != lastdish){
            	time += kuriage(numbers[i]);
            }
        }
      	time+= numbers[lastdish];
        System.out.println(time);
    }
  	public static int resi(int n){
    	    int r=0;
          	if(n%10 == 0){
            	r = 10;
            } else {
            	r = n%10;
            }
      	return r;
    }
  	public static int kuriage(int n){
    	int a = 0;
      	if(n%10 == 0){
        	return n;
        } else {
        	return n + (10-n%10);
        }
    }
  
}