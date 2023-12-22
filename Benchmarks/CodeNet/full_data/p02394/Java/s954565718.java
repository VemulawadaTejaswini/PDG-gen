import java.util.*;
  
class Main{
   public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    int w = input.nextInt();//5
	int h = input.nextInt();//4
	int x = input.nextInt();//2
	int y = input.nextInt();//4
	int r = input.nextInt();//1
   	int inputhightforcircle = (y + r);//5
   	int inputwideforcircle = (x + r);//3
   	
   	if(inputhightforcircle <= h && inputwideforcircle <= w && inputhightforcircle >= 0 && inputwideforcircle >= 0){
     	System.out.println("Yes");
   	}else{
   		System.out.println("No");
   	}
   	
  }
}