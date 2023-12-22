
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        int overcount = 0, count, n, empID;
        Queue<Integer> queue = new LinkedList<Integer>();

        while ( (count = Integer.parseInt(bReader.readLine())) != 0 )
        {
            n = 0;
            while ( n < count )
            {
                String str = bReader.readLine();
                String[] editedstr = str.split(" ");
                queue.offer(Integer.parseInt(editedstr[0]));
                queue.offer(Integer.parseInt(editedstr[1]));
                queue.offer(Integer.parseInt(editedstr[2]));
                n++;
            }

            for ( n = 0; n < count; n++ )
            {
                empID = queue.poll();
                if ( (queue.poll() * queue.poll()) >= 1000000 )
                {
                    System.out.println(empID);
                    overcount++;
                }
                
                if(overcount==0)
                {
                    System.out.println("NA");
                }
            }
            queue.clear();
        }

    }
}