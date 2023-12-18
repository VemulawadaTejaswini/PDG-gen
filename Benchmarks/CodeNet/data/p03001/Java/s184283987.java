import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(Sytem.in);
      	int width = scan.nextInt();	
      	int height = scan.nextInt();
      	int x = scan.nextInt();
      	int y = scan.nextInt();
      	float yoko = 0;//y
      	float tate = 0;//x
        yoko = Math.min(width * (height - y), width * y);
      	tate = Math.min(height * (width - x), height * x);
      	System.out.print(Math.max(tate,yoko));
      	int mi = 0;
      	if(yoko == tate) {
        	mi = 1;
        }
      	System.out.print(" " + mi);
    
    }


}