import java.util.Scanner;

public class Main {


    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    	int W = sc.nextInt();
    	int H = sc.nextInt();
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	int r = sc.nextInt();
    	if(W >= x + r && H >= y + r)
    	{
        	if(0 <= x - r && 0 <= y - r)
        	{
        		System.out.println("Yes");
        	}
        	else
        	{
        		System.out.println("No");
        	}
    	}
    	else
    	{
    		System.out.println("No");
    	}
        sc.close();
    }

}