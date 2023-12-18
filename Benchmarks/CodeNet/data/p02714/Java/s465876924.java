import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        long count = 0;
        ArrayList<Integer> Red = new ArrayList<>();
        ArrayList<Integer> Blue = new ArrayList<>();
        ArrayList<Integer> Green = new ArrayList<>();
        for(int i=0;i<N;i++)
        {
            if(S.substring(i,i+1).equals("R"))
                Red.add(i);
            else if(S.substring(i,i+1).equals("B"))
                Blue.add(i);
            else
                Green.add(i);
        }
        for(int i=0;i<Red.size();i++)
        {
            int r = Red.get(i);
            for(int j=0;j<Blue.size();j++)
            {
                int b = Blue.get(j);
                for(int k=0;k<Green.size();k++)
                {
                    int g = Green.get(k);
                    int[] temp = new int[3];
                    temp[0] = r;
                    temp[1] = b;
                    temp[2] = g;
                    Arrays.sort(temp);
                    if(temp[1] - temp[0] == temp[2] - temp[1])
                        continue;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
