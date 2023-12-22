import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int n = Integer.parseInt(cin.next());
        int[] array = new int [n];
        cin.nextLine();
        for (int i = 0; i < n; i++)
        {
            array[i] = cin.nextInt();
        }

        int cnt = selectionSort(array, n);
        for (int i = 0; i < n; i++)
        {
            System.out.print(array[i]);
            if (i != n - 1)
            {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(cnt);
    }

    // Return count
    public static int selectionSort(int[] A, int N)
    {
        int minj;

        int cnt = 0;
        for (int i = 0; i < N; i++)
        {
            minj = i;
            for (int j = i; j < N; j++)
            {
                if (A[j] < A[minj])
                {
                    minj = j;
                }
            }
            int tmp = A[i];
            A[i] = A[minj];
            A[minj] = tmp;
            if (i != minj)
                cnt++;
        }

        return cnt;
    }
}