import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\s+|,");
        int w = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        java.util.stream.IntStream.range(1,w+1).forEach(item->list.add(item));
        for(int i=0;i<n;i++)
        {
            SwapAt(list,sc.nextInt(),sc.nextInt());
        }
        for(int item:list)System.out.println(item);
	}

	static void SwapAt(List<Integer> list,int a,int b)
    {
        a--;b--;
        int c =  list.get(a);
        list.set(a,list.get(b));
        list.set(b,c);
    }
}