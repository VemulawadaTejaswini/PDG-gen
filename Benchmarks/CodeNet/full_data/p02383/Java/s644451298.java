import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] num = new int[6];
        for(int i = 0; i < 6; i++) {
            num[i] = scn.nextInt();
        }
        Dice dice = new Dice(num);
        dice.move(scn.next());
        System.out.println(dice.show(Dice.TOP));
    }
}

class Dice {
    int[] num_ = new int[6];
    public static final int
      TOP = 0, SOUTH = 1, EAST = 2,
      WEST = 3, NORTH = 4, BOTTOM = 5;
    
    public Dice(int... num) {
        for(int i = 0; i < 6; i++) {
            num_[i] = num[i];
        }
    }
    
    public int show(int side) {
        return num_[side];
    }
    
    public void move(String str) {
        char[] ary = str.toCharArray();
        for(char elm : ary) {
            move(elm);
        }
    }
    
    public void move(char dir) {
        if(dir == 'S') {
            toSouth();
        } else if(dir == 'E') {
            toEast();
        } else if(dir == 'W') {
            toWest();
        } else if(dir == 'N') {
            toNorth();
        }
    }
    
    private void toSouth() {
        int tmp      = num_[TOP];
        num_[TOP]    = num_[NORTH];
        num_[NORTH]  = num_[BOTTOM];
        num_[BOTTOM] = num_[SOUTH];
        num_[SOUTH]  = tmp;
    }
    
    private void toEast() {
        int tmp      = num_[TOP];
        num_[TOP]    = num_[WEST];
        num_[WEST]   = num_[BOTTOM];
        num_[BOTTOM] = num_[EAST];
        num_[EAST]   = tmp;
    }
    
    private void toWest() {
        int tmp      = num_[TOP];
        num_[TOP]    = num_[EAST];
        num_[EAST]   = num_[BOTTOM];
        num_[BOTTOM] = num_[WEST];
        num_[WEST]   = tmp;
    }
    
    private void toNorth() {
        int tmp      = num_[TOP];
        num_[TOP]    = num_[SOUTH];
        num_[SOUTH]  = num_[BOTTOM];
        num_[BOTTOM] = num_[NORTH];
        num_[NORTH]  = tmp;
    }
}