//ABC333.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==1&&b==1){
            System.out.println("Yes");
        }
        else if(a==3&&b==3){
            System.out.println("Yes");
        }
        else if(a==1&&b==3||a==3&&b==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}