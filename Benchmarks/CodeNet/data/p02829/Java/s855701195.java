import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
        Scanner s=new Scanner(System.in);
        s.close();

        int a=s.nextInt();
        int b=s.nextInt();

        if(a==1 && b==2){
            System.out.println(3);
        }
        if(a==1 && b==3){
            System.out.println(2);
        }
        if(a==2 && b==1){
            System.out.println(3);
        }
        if(a==2 && b==3){
            System.out.println(1);
        }
        if(a==3 && b==1){
            System.out.println(2);
        }
        if(a==3 && b==2){
            System.out.println(1);
        }
    }
}