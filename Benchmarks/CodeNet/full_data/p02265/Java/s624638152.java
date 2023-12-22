import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            int i;
            int n = Integer.parseInt(br.readLine());
            Deque<Integer> list = new ArrayDeque<Integer>();
            int[] num = new int[2];
            char c;
            for(i=0; i<n; i++)
            {
                String command = br.readLine();
                c = command.charAt(0);
                if(c == 'i')
                {
                    num = Integer.parseInt(command.split(" ",0));
                    list.offerFirst(num[1]);
                }
                else if(c == 'd')
                {
                    c = command.charAt(6);
                    if(c == 'F')
                    {
                        list.pollFirst();
                    }
                    else if(c == 'L')
                    {
                        list.pollLast();
                    }
                    else
                    {
                        num = Integer.parseInt(command.split(" ",0));
                        list.remove((Integer)num[1]);
                    }
                }
            }
            int size = list.size();
            for(i=0; i<size-1; i++)
            {
                System.out.printf("%d ",list.poll());
            }
            System.out.println(list.poll());
        }
        catch(Exception e)
        {
        }
    }
}