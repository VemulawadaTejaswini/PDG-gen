import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        
        String[] input = lines[0].split("/");
        int y = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int d = Integer.parseInt(input[2]);
        
        if (y<2019)  {
            System.out.println("Heisei");
        }
        else if (y==2019 && m<=4 && d<=30){
            System.out.println("Heisei");
        }
        else {
            System.out.println("TBD");
        }
    }
    
    private static String[] getStdin() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();
        while (scanner.hasNext()) {
            lines.add(scanner.nextLine());
        }
        return lines.toArray(new String[lines.size()]);
    }
}