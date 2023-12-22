import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn=new Scanner(System.in);
		int w=stdIn.nextInt();
		int h=stdIn.nextInt();
		int x=stdIn.nextInt();
		int y=stdIn.nextInt();
		int r=stdIn.nextInt();

		if(x-r>=0) && (y-r=0) && (x+r<=w) && (y+r<=h){
                  System.out.println("Yes");
                 }
		
		 else{
                     System.out.println("No");
                     }
		
        }
}