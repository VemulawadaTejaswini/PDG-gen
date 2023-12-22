import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lines = line.split(" ", 0);
      
        int num = Integer.parseInt(lines[0]);
        int dis = Integer.parseInt(lines[1]);
      
      int count = 0;
        for (int i = 0; i < num; i++) {
            line = sc.nextLine();
        	String[] lines2 = line.split(" ", 0);
            double pos = Math.sqrt(Long.parseLong(lines2[0]) * Long.parseLong(lines2[0])
              + Long.parseLong(lines2[1]) * Long.parseLong(lines2[1]));
          if (pos <= dis) {
                count++;
            }else{
          }
        }
        
     System.out.println(count);
    }
}