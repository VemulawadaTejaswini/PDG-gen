import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        String[] lines = getStdin();

        int n = Integer.parseInt(lines[0]);
        String[] inputs = lines[1].split(" ");
        long mul = 1;
        for (int i = 0; i < n; i++) {
            mul *= Long.parseLong(inputs[i]);
            if(mul>1000000000000000000L) {
                System.out.println(-1);
                return;
            }
            if(mul == 0) {
                break;
            }
        }
        System.out.println(mul);

    }

    private static String[] getStdin()
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        while (scanner.hasNext()) {
            lines.add(scanner.nextLine());
        }
        return lines.toArray(new String[lines.size()]);
    }

}