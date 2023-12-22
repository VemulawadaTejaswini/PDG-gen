import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {      
      Scanner sc = new Scanner(System.in);
      int[] dice = new int[6];
      for (int i=0; i<6; i++) {
        dice[i] = sc.nextInt();
      }
      String str = sc.next();
      for (int g=0; g<str.length(); g++) {
        switch (str.charAt(g)) {
          case 'S':
            int[] diceafters = {dice[4],dice[0],dice[2],dice[3],dice[5],dice[1]};
            for (int i=0; i<6; i++) dice[i] = diceafters[i];
             Arrays.fill(diceafters,0);
            break;
          case 'E':
            int[] diceaftere = {dice[3],dice[1],dice[0],dice[5],dice[4],dice[2]};
            for (int i=0; i<6; i++) dice[i] = diceaftere[i];
            Arrays.fill(diceaftere,0);
            break;
          case 'N':
            int[] diceaftern = {dice[1],dice[5],dice[2],dice[3],dice[0],dice[4]};
            for (int i=0; i<6; i++) dice[i] = diceaftern[i];
            Arrays.fill(diceaftern,0);
            break;
          case 'W':
            int[] diceafterw = {dice[2],dice[1],dice[5],dice[0],dice[4],dice[3]};
            for (int i=0; i<6; i++) dice[i] = diceafterw[i];
            Arrays.fill(diceafterw,0);
            break;
        }
      }
        System.out.println(dice[0]);
    }
}
