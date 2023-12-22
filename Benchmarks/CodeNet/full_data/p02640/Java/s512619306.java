import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
      
     	int X = in.nextInt();
      	int Y = in.nextInt();
      	int a = 0;
      	int b = X;
      	int ans = 0;
      	int sec = 0;
      
      if(X>=1&&X<=100&&Y>=1&&Y<=100){
        for(int i=0;i<=X+1;i++){
          	a = a+1;
    		b = X-a;
        	if(2*a+4*b==Y){
         	 ans = 1;
             sec = 1;
       		}else{
             ans = 0;
            }
        }
        if(sec==1){
          System.out.println("Yes");
        }else if(ans==0){
          System.out.println("No");
        }
      }
    }
}
      