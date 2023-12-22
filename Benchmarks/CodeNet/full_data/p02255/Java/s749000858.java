import java.util.*;

public class Main
{

    public static Scanner in = new Scanner(System.in);

    public void print(int[] a)
    {
        for (int i = 0; i <a.length-1 ; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(a[a.length-1]);
    }

    public int[] insert(int[] a)
    {

        for (int i = 0; i <a.length ; i++)
        {
            int key=a[i];
            int j=i-1;

            while (j>=0 && a[j]>key)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
            new Main().print(a);
        }
        return a;

    }

    public void go()
    {
        int N = in.nextInt();

        int[] box = new int[N];

        for (int i = 0; i < N; i++)
        {
            box[i] = in.nextInt();
        }

        new Main().insert(box);

    }

    public static void main(String[] args)
    {
        new Main().go();

    }
}