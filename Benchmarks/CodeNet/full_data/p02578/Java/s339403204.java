import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner inputs = new Scanner(System.in);
        int n = inputs.nextInt();
        List<Integer> a = new ArrayList<>();

        for(int i=0; i<n; i++)
            a.add(inputs.nextInt());

        int totalDiff = 0;
        for(int i=1; i<a.size(); i++)
            if(a.get(i) < a.get(i-1)){
                totalDiff += a.get(i-1) - a.get(i);
                a.set(i, a.get(i-1));
            }
        System.out.println(totalDiff);
    }
}
