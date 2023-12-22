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
                    list.add(scan.nextInt());
                    break;
                case "delete":
                    int num=list.indexOf(scan.nextInt());
                    if(num!=-1)
                    {
                        list.remove(list.indexOf(num));
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
        }
        for(int i=0; i<list.size(); i++)
        {
            System.out.printf("%d",list.get(list.size()-i-1));
            if(i<list.size()-1)
            {
                System.out.printf(" ");
            }
        }
        System.out.println();
    }
}