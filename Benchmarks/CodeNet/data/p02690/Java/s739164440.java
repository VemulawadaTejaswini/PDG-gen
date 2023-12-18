import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    
    int X = scan.nextInt();
    int a = 0;
    int b = 0;
    boolean sign = true;
    
    if(X < 0){
      sign = false;
      X = -X;
    }
    
	for(int x = 0; x < 120; x++){
		if(Math.pow(x, 5) > X){
			if(Math.pow(x, 5) - X > Math.pow(x-1, 5)){
				x = x-1;
				X -= Math.pow(x, 5);
			}else{
				X -= Math.pow(x, 5);
			}
			for(int y = x; y >= -x; y--){
				if(Math.pow(-y, 5) == X){
					a = x;
					b = y;
					break;
				}
			}
			break;
		}
	}


    if(sign == false){
		a = -a;
		b = -b;
	}
    System.out.print(a + " " + b);
   }
}