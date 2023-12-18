import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         int r=sc.nextInt();
         int D=sc.nextInt();
         int x=sc.nextInt();
         for(int i =1; i<=10; i++)
         {
             System.out.println(recur(i, r, D, x));
         }

    }
    static int recur(int index, int r, int D, int x)
    {
        if(index==0)
        {
            return x;
        }
        return r*recur(index-1, r, D, x)-D;
    }


}
