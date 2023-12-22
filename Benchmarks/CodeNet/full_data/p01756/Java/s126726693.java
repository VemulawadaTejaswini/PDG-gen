import java.util.*;

class Main
{
    private static Scanner cin = new Scanner(System.in);
    private static String S = null;
    
    public static int Process()
    {
        String[] Raw = cin.nextLine().split(" ");
        String x = Raw[0];
        String y = Raw[1];

        int BeginAt = S.indexOf(x);
        if (BeginAt == -1) return 0;

        int EndAt = S.lastIndexOf(y);
        if (EndAt == -1 || EndAt < BeginAt) return 0;
        
        return EndAt - BeginAt + y.length();
    }
    
    public static void main(String[] args)
    {
        try
        {
            S = cin.nextLine();
            int Cases = Integer.parseInt(cin.nextLine());
            
            for (int t = 1; t <= Cases; t++)
                System.out.println(Process());
            
        } catch (Exception ex) { }        
    }
}