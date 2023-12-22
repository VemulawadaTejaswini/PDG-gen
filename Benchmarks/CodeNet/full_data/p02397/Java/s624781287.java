import java.util.Scanner;

class Main{
    public static void main(String[] a){
    	int x, y ,tmp;
    	Scanner in = new Scanner(System.in);
      while (true){
      	x = in.nextInt();
      	y = in.nextInt();
      	if(x == 0 && y == 0) break;
      	if(x<y)
        	System.out.println(x + " " + y);
        else
        	System.out.println(y + " " + x);
      }
    }
}