import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            String[] dataset = input.split(",");
            
            int[] sectionLen  = new int[10];
            double totalLen = 0;

            for (int i = 0; i < sectionLen.length; i++) {
                sectionLen[i] = Integer.parseInt(dataset[i]);
                totalLen += (double) sectionLen[i];
            }
            int v1 = Integer.parseInt(dataset[10]);
            int v2 = Integer.parseInt(dataset[11]);
            
            double time = totalLen / (v1 + v2);
            double distance = v1 * time;
            
            for (int i = 0; i < sectionLen.length; i++) {
                distance -= sectionLen[i];
                if (distance <= 0) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}