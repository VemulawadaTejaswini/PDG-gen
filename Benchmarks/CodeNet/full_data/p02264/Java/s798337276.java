import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Deque<String> name = new ArrayDeque<String>();
        Deque<Integer> time = new ArrayDeque<Integer>();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int quantum = scan.nextInt();

        for(int i=0; i<n; i++)
        {
            name.offerLast(scan.next());
            time.offerLast(scan.nextInt());
        }

        String process_name;
        int process_time;
        int elapsed_time = 0;
        while((process_name = name.pollFirst())!=null)
        {
            process_time = time.pollFirst();
            if(process_time > quantum)
            {
                name.offerLast(process_name);
                time.offerLast(process_time - quantum);
                elapsed_time += quantum;
            }
            else
            {
                elapsed_time += process_time;
                System.out.println(process_name + " " + elapsed_time);
            }
        }
    }
}