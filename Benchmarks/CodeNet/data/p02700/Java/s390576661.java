import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String number = lines[0];
        String[] line = number.split(" ");
        int T_hp = Integer.parseInt(line[0]);
        int T_attack = Integer.parseInt(line[1]);
        int A_hp = Integer.parseInt(line[2]);
        int A_attack = Integer.parseInt(line[3]);

        for (int i = 0; i < 100; i++){
            A_hp = A_hp - T_attack;
            if (A_hp <= 0){
                System.out.println("Yes");
                return;
            }
            T_hp = T_hp - A_attack;
            if (T_hp <= 0){
                System.out.println("No");
                return;
            }
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
