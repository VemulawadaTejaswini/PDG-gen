import javax.sound.midi.Soundbank;
import java.util.*;
import java.lang.*;

public class Main
{
    public static int countDistinct(int arr[],int n)
    {

        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i = 0; i < n; i++)
        {
            // add all the elements to the HashSet
            hs.add(arr[i]);
        }

        // return the size of hashset as
        // it consists of all Unique elements
        return hs.size();
    }
    public static void main (String[] args) {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();
        int[] col = new int[n];
        for (int i = 0; i < n; i++)
            col[i] = s.nextInt();

        for(int i=0; i<q; i++)
        {
            int l = s.nextInt();
            int r = s.nextInt();
            int[] c = new int[r-l+1];
            for(int j=0; j<c.length; j++)
            {
                c[j] = col[j+l-1];
            }
            System.out.println(countDistinct(c, c.length));
        }
    }
}
