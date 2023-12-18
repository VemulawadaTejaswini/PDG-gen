import java.util.*;
 public class Main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        StringTokenizer dates=new StringTokenizer(sc.nextLine());
        StringTokenizer dates2=new StringTokenizer(sc.nextLine());
        int mayor=0;
        for(int i = 0; i < N; i++)
        {
            int a = Integer.parseInt(dates.nextToken());
            int b = Integer.parseInt(dates2.nextToken());
            if(a-b > 0)
            {
                mayor+= a-b;
            }
        }
        System.out.println(mayor);
  }
}