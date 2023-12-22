import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String[] a = sc.nextLine().split(" ");
        int[] men = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            men[i] = Integer.parseInt(a[i]);
        }

        Dice dice = new Dice(men);

        String[] words = sc.nextLine().split("");
        for (String w : words) {
            if ( w.equals("N") ) { 
                dice.turnN(); 
            } else if ( w.equals("E") ) { 
                dice.turnE(); 
            } else if ( w.equals("S") ) { 
                dice.turnN(); 
                dice.turnN(); 
                dice.turnN(); 
            } else if ( w.equals("W") ) { 
                dice.turnE(); 
                dice.turnE(); 
                dice.turnE(); 
            }
        }

        System.out.println(dice.top);
    }
}

class Dice {
    int top, front, right, left, back, bottom;

    public Dice(int[] men){
        this.top = men[0];
        this.front = men[1];
        this.right = men[2];
        this.left = men[3];
        this.back = men[4];
        this.bottom = men[5];
    }

    void turnN() {
        int tmp = this.top;
        this.top = this.front;
        this.front = this.bottom;
        this.bottom = this.back;
        this.back = tmp;
    }
    void turnE() {
        int tmp = this.top;
        this.top = this.left;
        this.left = this.bottom;
        this.bottom = this.right;
        this.right = tmp;
    }
}

