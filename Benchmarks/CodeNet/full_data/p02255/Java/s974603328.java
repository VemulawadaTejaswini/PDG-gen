import java.util.Scanner;

public class Main
{

    public static int number;
    public static int[] A=new int[1000];

    public static void main(String[] args)
    {
        
        Scanner scan=new Scanner(System.in);
        number=scan.nextInt();

        for(int i=0;i<number;i++){
            A[i]=scan.nextInt();
            if(i!=number-1) System.out.print(A[i]+" ");
            if(i==number-1) System.out.print(A[i]);
        }
        System.out.println();

        insertionSort();

    }

    public static void insertionSort()
    {
        int v,j=0;
        for(int i=1;i<=number-1;i++)
        {
            v = A[i];
            j=i-1;
            while(j>=0 && A[j]>v)
            {
                A[j+1]=A[j];
                j--;
            }
            A[j+1]=v;

            for(int l=0;l<number;l++)
            {
                if (l != number - 1) System.out.print(A[l] + " ");
                if (l == number - 1) System.out.print(A[l]);
            }
            System.out.println();
        }

    }
}