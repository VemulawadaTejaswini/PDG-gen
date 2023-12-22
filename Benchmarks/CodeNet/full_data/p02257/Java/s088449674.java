import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int Count=0;
        int count_num=scan.nextInt();

        for(int j=0;j<count_num;j++)
        {
            int Num=scan.nextInt();
            int s=0;

            for (int i=2;i<=Num/2;i++)
            {
                if(Num%i==0){
                    s=1;
                    break;
                }
            }
            if(s==0) Count++;
        }

        System.out.println(Count);

    }
}