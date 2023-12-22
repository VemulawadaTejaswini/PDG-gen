import java.util.*;

public class Main
{
    public static void main(String... args)
    {
        final Scanner scanner = new Scanner(System.in);
        final ArrayList<Integer> heights = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            heights.add(scanner.nextInt());
        }

        Collections.sort(heights, new Comparator<Integer>()
        {
            @Override
            public int compare(Integer height1, Integer height2)
            {
                return height1.compareTo(height2) * -1;
            }
        });

        for (int i = 0; i < 3; i++) {
            System.out.println(heights.get(i));
        }
    }
}