import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        double d=sc.nextDouble();
        double t=sc.nextDouble();
        double s=sc.nextDouble();
        double sum=d/s;

        //System.out.println(sum);

        if(sum<=t){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}