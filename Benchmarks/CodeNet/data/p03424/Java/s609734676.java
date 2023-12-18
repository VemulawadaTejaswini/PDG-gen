import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "Three";
        for(int i = 0; i < n; i++)
            if(sc.next().charAt(0) == 'Y')
                ans = "Four";
        System.out.println(ans);
    }
}