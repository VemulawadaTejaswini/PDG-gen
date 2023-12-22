import java.util.*;
import java.lang.*;

public class Main {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int[] surface = new int[6];
        for (int i = 0; i < 6; i++) {
            surface[i] = sc.nextInt();
        }
        String s = sc.next();
        
        Dice dice = new Dice(s, surface);
    
        System.out.println(dice.step());

    }
}

class Dice {
    int[] oldsurf = new int[6];
    int[] newsurf = new int[6];
    String commands;
    
    Dice(String s, int[] surface) {
        commands = s;
        for (int i = 0; i < 6; i++) {
            oldsurf[i] = surface[i];
        }
    }
    
    int step() {
        for (int i = 0; i < commands.length(); i++) {
            char command = commands.charAt(i);
            if (command == 'N') {
                newsurf[0] = oldsurf[1];
                newsurf[1] = oldsurf[5];
                newsurf[2] = oldsurf[2];
                newsurf[3] = oldsurf[3];
                newsurf[4] = oldsurf[0];
                newsurf[5] = oldsurf[4];
            } else if (command == 'S') {
                newsurf[0] = oldsurf[4];
                newsurf[1] = oldsurf[0];
                newsurf[2] = oldsurf[2];
                newsurf[3] = oldsurf[3];
                newsurf[4] = oldsurf[5];
                newsurf[5] = oldsurf[1];
                
            } else if (command == 'E') {
                newsurf[0] = oldsurf[3];
                newsurf[1] = oldsurf[1];
                newsurf[2] = oldsurf[0];
                newsurf[3] = oldsurf[5];
                newsurf[4] = oldsurf[4];
                newsurf[5] = oldsurf[2];
                
            } else if (command == 'W') {
                newsurf[0] = oldsurf[2];
                newsurf[1] = oldsurf[1];
                newsurf[2] = oldsurf[5];
                newsurf[3] = oldsurf[0];
                newsurf[4] = oldsurf[4];
                newsurf[5] = oldsurf[3];
                
            }
            for (int j = 0; j < 6; j++) {
                oldsurf[j] = newsurf[j];
            }
        }
        return newsurf[0];
    }
}
