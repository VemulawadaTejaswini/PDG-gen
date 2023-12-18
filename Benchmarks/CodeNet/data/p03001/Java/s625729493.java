import java.util.Scanner;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int w = sc.nextInt();
      	int h = sc.nextInt();
      	int x = sc.nextInt();
      	int y = sc.nextInt();
      
      	double area = (double)w*h/2.0;
      	int d = 0;
      	if(w==2*x && h==2*y)
          d = 1;
      	System.out.print(area);
      	System.out.println(" " + d);
    }
}