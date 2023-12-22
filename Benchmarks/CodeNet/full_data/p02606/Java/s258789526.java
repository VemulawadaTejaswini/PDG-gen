import javax.sound.midi.Soundbank;
import java.util.*;
import java.lang.*;

public class Main
{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int r = s.nextInt();
        int d = s.nextInt();
        int c = 0;
        if(l%d==0)
            c++;
        if(r%d==0)
            c++;
        c+=(r-l)/d;
        System.out.println(c);

    }
}
