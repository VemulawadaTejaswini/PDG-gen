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

            if(Num%2==0 && Num!=2) s=1;

            for (int i=3;i<=Num/2;i+=2)
            {
                if(Num%i==0){
                    s=1;
                }
                if(s==1) break;
            }
            if(s==0) Count++;
        }

        System.out.println(Count);

    }
}