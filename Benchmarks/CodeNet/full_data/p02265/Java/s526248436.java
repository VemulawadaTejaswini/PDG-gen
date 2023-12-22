import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
        try{
            int n = Integer.parseInt(br.readLine());
            Deque<Integer> list = new ArrayDeque<Integer>();
            String[] num = new String[2];
            for(int i=0; i<n; i++)
            {
                String command = br.readLine();
    //            String command = scan.next();
                switch(command.charAt(0))
                {
                    case 'i':
                        num = command.split(" ",0);
                        list.offerFirst(Integer.parseInt(num[1]));
                        break;
                    case 'd':
                        switch(command.charAt(6))
                        {
                            case 'F':
                                list.pollFirst();
                                break;
                            case 'L':
                                list.pollLast();
                                break;
                            case ' ':
                                num = command.split(" ",0);
                                list.remove((Integer)(Integer.parseInt(num[1])));
                                break;
                        }
                        break;
                }
            }
            while(list.size()>1)
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