import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double[] num = new double[100];
        for (int i=1; i<=num.length; i++)
        {
            System.out.println("Please input number: ");
            num[i] = scan.nextDouble();
            if(i%2 == 0)
            {
                if(i%3 == 0 || i%5 ==0)
                {
                    System.out.print("APPROVED");
                }
                else
                {
                    System.out.print("DENIED");
                }
            }
            else
            {

            }
        }
    }
}