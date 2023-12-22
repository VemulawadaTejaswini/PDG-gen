import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
      	int N = scn.nextInt();
      	int ans = 0;
      	ans = N % 10;
      	if(ans == 0 || ans == 1 || ans == 6 || ans == 8){
        	System.out.println("pon");
        }else if(ans == 2 || ans == 4 || ans == 5 || ans == 7 || ans == 9){
        	System.out.println("hon");
        }else{
        	System.out.println("bon");
        }
	}
}