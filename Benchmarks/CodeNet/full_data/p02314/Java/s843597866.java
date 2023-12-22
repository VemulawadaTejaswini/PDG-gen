import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.out;
import java.util.*;
import java.io.*;
class Coinchangingproblem
{
    public static void main(String[] args) throws Exception
    {
        //out.println("hi");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader scan = new BufferedReader(isr);
        StringTokenizer cut = new StringTokenizer(scan.readLine());
        
        int a = Integer.parseInt(cut.nextToken());
        int b = Integer.parseInt(cut.nextToken());
        
        int[] one = new int[b];
        int[] two = new int[a + 1];
        //ArrayList<Integer> coin = new ArrayList<Integer>();
        
        cut = new StringTokenizer(scan.readLine());
        int temp;
        int count = 0;
        for (int z = 0; z < b; z++)
        {
            temp = Integer.parseInt(cut.nextToken());
            //out.println("temp is" + temp);
            
            one[count] = temp;
            //out.println("placed coin " + one[count] + " into pool..");
            count++;
            
        }
        
        boolean go = true;
        
        int answer = 99999;
        two[0] = 0;
        //out.println("Two[0] is: 0");
        for (int z = 1; z < a + 1; z++)
        {
            answer = 99999;
            //out.println("Resetting, Z is now " + z);
            for (int y = 0; y < b; y++)
            {
                //out.println("Checking coin " + one[y]);
                if (one[y] <= z && two[z-one[y]] < answer)
                {                   
                    //out.println("Value for two[" + z + "] changing to " + two[z-one[y]]);
                    answer = two[z-one[y]];
                }
                //else out.println("nothing happened");
            }
            two[z] = answer + 1;
            //out.println("Two[" + z + "] is: " + two[z]);
        }
        out.println(two[a]);
    }
}