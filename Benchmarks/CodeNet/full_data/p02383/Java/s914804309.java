import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] n = br.readLine().split(" ");
        
        Dice dice = new Dice(n[0], n[1], n[2], n[3], n[4], n[5]);
        
        String command = br.readLine();
        
        for(int i = 0; i < command.length(); i++) {
            switch(command.charAt(i)) {
                case 'N':
                    dice.goNorth();
                    break;
                case 'S':
                    dice.goSouth();
                    break;
                case 'E':
                    dice.goEast();
                    break;
                case 'W':
                    dice.goWest();
                    break;
            }
        }

        System.out.println(dice.nowTopNum());
    }
}

class Dice {
    private String top;
    private String front;
    private String right;
    private String left;
    private String back;
    private String bottom;
    
    public Dice(String top, String front, String right, String left, String back, String bottom) {
        this.top = top;
        this.front = front;
        this.right = right;
        this.left = left;
        this.back = back;
        this.bottom = bottom;
    }
    
    public String nowTopNum() {
        return this.top;
    }
    
    public void goSouth() {
        String tmp = this.front;
        this.front = this.top;
        this.top = this.back;
        this.back = this.bottom;
        this.bottom = tmp;
    }

    public void goNorth() {
        String tmp = this.front;
        this.front = this.bottom;
        this.bottom = this.back;
        this.back = this.top;
        this.top = tmp;
    }

    public void goEast() {
        String tmp = this.top;
        this.top = this.left;
        this.left = this.bottom;
        this.bottom = this.right;
        this.right = tmp;
    }

    public void goWest() {
        String tmp = this.top;
        this.top = this.right;
        this.right = this.bottom;
        this.bottom = this.left;
        this.left = tmp;
    }
}

