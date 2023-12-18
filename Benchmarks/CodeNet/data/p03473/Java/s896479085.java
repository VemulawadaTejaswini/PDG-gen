//NewYear.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();

        System.out.println((24-m)+24);
        sc.close();
    }
}