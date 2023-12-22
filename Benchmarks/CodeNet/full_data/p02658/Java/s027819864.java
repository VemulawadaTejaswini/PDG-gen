import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        String[] lines = getStdin();

        int n = Integer.parseInt(lines[0]);
        String[] inputs = lines[1].split(" ");

        Long[] val = new Long[n];
        for (int i = 0;i<n;i++){
            val[i] = Long.parseLong(inputs[i]);
            if(val[i]==0){
                System.out.println(0);
                return;
            }
        }

        long mul = 1L;
        for (int i = 0; i < n; i++) {
            mul *= val[i];
            if(mul > 1000000000000000000L){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(mul);
    }

    private static String[] getStdin()
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        /*
        while (scanner.hasNext()) {
            lines.add(scanner.nextLine());
        }
        */
        lines.add(scanner.nextLine());
        lines.add(scanner.nextLine());
        return lines.toArray(new String[lines.size()]);
    }
}
