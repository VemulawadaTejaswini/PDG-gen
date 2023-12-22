import java.util.*;
  
class main{
   public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    int w = input.nextInt();//5
	int h = input.nextInt();
	int x = input.nextInt();
	int y = input.nextInt();
	int r = input.nextInt();
   	int inputhightforcircle = (y + r);
   	int inputwideforcircle = (x + r);
   	
   	if(inputhightforcircle <= h && inputwideforcircle <= w && inputhightforcircle >= 0 && inputwideforcircle >= 0){
     	System.out.println("Yes");
   	}else{
   		System.out.println("No");
   	}
   	
  }
}