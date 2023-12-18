import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        String[] array = line.split(" ");
        int hp = Integer.parseInt(array[0]);
        int attack = Integer.parseInt(array[1]);
        
        int result = 0;
        result = hp / attack;
        if(hp % attack != 0)
        {
            result++;
        }
        
        System.out.println(result);
    }
}
