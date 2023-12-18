import java.util.*;
class Main{
	public static void main(String[] args){
      	int[] numbers = new int[6];
      	int ans = 0;
    	Scanner scan = new Scanner(System.in);
      	for(int i=0;i<6;i++){
        	numbers[i] = scan.nextInt();
        }
      	int small = numbers[0];
      	for(int i=0;i<5;i++){
          	ans+= time(small,numbers[i+1]);
          	if(numbers[i+1] < small){
            	small = numbers[i+1];
            }
        }
      	System.out.println(ans);
    }
  	public static int time(int a, int b){
      	if(a<=b){
        	return 1;
        } else if(b%a==0){
        	return a/b;
        } else {
         	return a/b + 1;
        }
    }
}