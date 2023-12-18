import java.util.*;

public class Main {
  public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int hp = sc.nextInt();
    	int attack = sc.nextInt();
    	if(hp % attack == 0) {
          System.out.println(hp / attack);
        } else {
          System.out.println(hp / attack + 1);
        }
  }
}