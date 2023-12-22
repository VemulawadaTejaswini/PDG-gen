import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
      
     	int X = in.nextInt();
      	int Y = in.nextInt();
      	int a = 0;
      	int b = X;
      
      if(X>=1&&X<=100&&Y>=1&&Y<=100){
        for(int i=0;i<X+1;i++){
          	a = a+1;
    		b = X-a;
        	if(2*a+4*b==Y){
         	 System.out.println("Yes");
       		}else{
             System.out.println("No");
            }
       
        }
      }
      
      
    }
}
      