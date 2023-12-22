import java.util.Scanner;

public class Main {

    public static int Num;
    public static int[] List;
    public static int Count=0;
    public static int min_j;
    public static int tmp;

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        Num=scan.nextInt();

        List=new int[Num];

        for(int i=0;i<Num;i++)
        {
            List[i]=scan.nextInt();
        }

        SelectionSort();

        if(Num==1) System.out.println(List[0]);
        else
        {
            for (int i = 0; i < Num; i++)
            {
                if(i==Num-1) System.out.println(List[Num-1]);
                else System.out.print(List[i] + " ");
            }
        }
        System.out.println(Count);

    }

    public static void SelectionSort()
    {
        for(int i=0;i<Num;i++)
        {
            min_j=i;
            for(int j=i;j<Num;j++)
            {
                if(List[j]<List[min_j])
                {
                    min_j=j;
                }
            }
            if(min_j!=i){
                tmp=List[i];
                List[i]=List[min_j];
                List[min_j]=tmp;
                Count++;
            }
        }
    }
}