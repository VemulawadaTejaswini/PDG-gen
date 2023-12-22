import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n=scanner.nextInt();
        HashMap<Integer, Integer> map
                = new HashMap<>();
        long sum =0;
        for(int j=0;j<n;j++)
        {
            Integer temp=scanner.nextInt();
            if(map.containsKey(temp))
            {
                Integer x =map.get(temp);
                x++;
                map.put(temp,x);
            }
            else
            {
                map.put(temp,1);
            }
            sum+=temp;
        }

        long q= scanner.nextLong();
        for(int j=0;j<q;j++)
        {
            Integer b=scanner.nextInt();
            Integer c=scanner.nextInt();
            if(map.containsKey(b))
            {
                Integer x;
                if(map.containsKey(c))
                {
                    x = map.get(b);
                    sum-=b*map.get(b);
                    Integer y=map.get(c);
                    y+=x;
                    sum+=x*c;
                    map.put(c,y);
                }
                else
                {
                    x = map.get(b);
                    sum-=b*map.get(b);
                    map.put(c,x);
                    sum+=c*x;
                }
                map.remove(b);

            }
            System.out.println(sum);
        }
	// write your code here
    }
}