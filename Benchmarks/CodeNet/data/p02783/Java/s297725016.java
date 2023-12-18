import java.util.Scanner;

class program
{
    public static void main(String args[])
    {
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        int m=input.nextInt();
        
        if(n%m>0)
        {
            System.out.println(n/m + 1);
        }
        
        else{
            System.out.println(n/m);
        }
    }
}
