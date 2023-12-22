import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final String title = sc.next(); // 3 <= N <=25
        int count = 0;
        for(int i = 0; i < N; ++i)
        {
            final String old = sc.next();
            if(creatable(title, old))
            {
                ++count;
            }
        }
        System.out.println(count);
    }

    private static boolean creatable(final String title, final String old)
    {
        for(int first = old.indexOf(title.charAt(0)); first != -1; first = old.indexOf(title.charAt(0), first + 1))
        {
            for(int second = old.indexOf(title.charAt(1), first + 1); second != -1; second = old.indexOf(title.charAt(1), second + 1))
            {
                final int first_second_dif = second - first;
                int backpoint = second;
                for(int seek = 2, tail = old.indexOf(title.charAt(seek), second + 1); seek < title.length() && tail != -1; tail = old.indexOf(title.charAt(seek), tail + 1))
                {
                    if(first_second_dif == tail - backpoint)
                    {
                        if(seek == title.length() - 1)
                        {
                            return true;
                        }
                        backpoint = tail;
                        ++seek;
                    }
                }
            }
        }
        return false;
    }
}