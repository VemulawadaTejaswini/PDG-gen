import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0; i<n; i++)
        {
            String command = scan.next();

            switch(command)
            {
                case "insert":
                    list.addFirst(scan.nextInt());
                    break;
                case "delete":
                    int num=list.indexOf(scan.nextInt());
                    if(num!=-1)
                    {
                        list.remove(num);
                    }
                    break;
                case "deleteFirst":
                    list.removeFirst();
                    break;
                case "deleteLast":
                    list.removeLast();
                    break;
                default:
                    break;
            }
/*            for(int j=0; j<list.size(); j++)
            {
                System.out.printf("%d",list.get(j));
                if(i<list.size()-1)
                {
                    System.out.printf(" ");
                }
            }
            System.out.println();*/
        }
        for(int i=0; i<list.size(); i++)
        {
            System.out.printf("%d",list.get(i));
            if(i<list.size()-1)
            {
                System.out.printf(" ");
            }
        }
        System.out.println();
    }
}