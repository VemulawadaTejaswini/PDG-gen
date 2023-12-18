import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String number = lines[0];
        String[] num = number.split("");
        int hundred = Integer.parseInt(num[0]);
        int ten = Integer.parseInt(num[1]);
        int one = Integer.parseInt(num[2]);

        for (int i = 0; i < num.length; i++){
            if (num[i].contains("7")){
                System.out.println("Yes");
                return;
            }
        }
            System.out.println("No");

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
