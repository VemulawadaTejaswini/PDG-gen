import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] likes = new int[N];
        int[] alsoLikes = new int[N];

        for(int i=0; i<N; i++)
        {
            likes[i] = scanner.nextInt();
        }
        int c = 0;
        for(int i=0; i<N; i++)
        {
            int i_like = likes[i];
            int he_like = likes[i_like-1];
            if(i == he_like-1)
                c++;
        }
        System.out.println(c / 2);
    }
}