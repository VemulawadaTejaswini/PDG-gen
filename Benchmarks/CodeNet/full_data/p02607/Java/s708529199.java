import javax.sound.midi.Soundbank;
import java.util.*;
import java.lang.*;

public class Main
{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int c= 0;
        for(int j=0; j<n; j++)
        {
            int x = s.nextInt();
            if(j%2==0&&x%2==1)
                c++;
        }

        System.out.println(c);

    }
}
