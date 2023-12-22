import java.util.*;

public class Main {
    public static void main (String args[])
    {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        //aとbが0以下かつ
        ArrayList<Integer> result = new ArrayList<>();
        
        result.add(a*c);
        result.add(a*d);
        result.add(b*c);
        result.add(b*d);

        Integer max = Collections.max(result);
        System.out.println(max);
    }
}