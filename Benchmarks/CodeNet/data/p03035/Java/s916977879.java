import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>12){
			System.out.println(b);
		}
		else if(5<a && a<13){
			System.out.println(b/2);
		}
		else{
			System.out.println('0');
		}
	}
}