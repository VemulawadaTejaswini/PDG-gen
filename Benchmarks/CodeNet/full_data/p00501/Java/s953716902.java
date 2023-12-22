import java.text.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        new Main().doit();
    }

    private void doit()
    {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final String title = sc.next();
        int count = 0;
        for(int i = 0; i < N; ++i)
        {
            final String old = sc.next();
            if(this.creatable(title, old))
            {
                ++count;
            }
        }
        System.out.println(count);
    }

    private boolean creatable(final String title, final String old)
    {
        for(int bi = old.indexOf(title.charAt(0)); bi != -1; bi = old.indexOf(title.charAt(0), bi + 1))
        {
            for(int dif = 1; dif <= (old.length() - bi - 1) / (title.length() - 1); ++dif)
            {
                for(int ti = 1; ti < title.length(); ++ti)
                {
                    if(title.charAt(ti) != old.charAt(bi + dif * ti))
                    {
                        break;
                    }
                    else if(ti == title.length() - 1)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}