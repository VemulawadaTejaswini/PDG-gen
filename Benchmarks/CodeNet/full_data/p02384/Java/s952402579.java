import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] num = new int[6];
        for(int i = 0; i < 6; i++) {
            num[i] = scn.nextInt();
        }
        Dice dice = new Dice(num);
        for(int i = scn.nextInt(); i > 0; i--) {
            dice.setTop(scn.nextInt());
            dice.setSouth(scn.nextInt());
            System.out.println(dice.show(Dice.EAST));
        }
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
    
    public void setTop(int num) {
        if(num_[TOP] != num) {
            if(num_[SOUTH] == num) {
                move('N');
            } else if(num_[EAST] == num) {
                move('W');
            } else if(num_[WEST] == num) {
                move('E');
            } else if(num_[NORTH] == num) {
                move('S');
            } else {
                move("SS");
            }
        }
    }
    
    public void setSouth(int num) {
        for(int i = 0; i < 4; i++) {
            if(num_[SOUTH] != num) {
                move('R');
            }
        }
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
        } else if(dir == 'R') {
            toRight();
        } else if(dir == 'L') {
            toLeft();
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
    
    private void toRight() {
        int tmp      = num_[SOUTH];
        num_[SOUTH]  = num_[WEST];
        num_[WEST]   = num_[NORTH];
        num_[NORTH]  = num_[EAST];
        num_[EAST]   = tmp;
    }
    
    private void toLeft() {
        int tmp      = num_[SOUTH];
        num_[SOUTH]  = num_[EAST];
        num_[EAST]   = num_[NORTH];
        num_[NORTH]  = num_[WEST];
        num_[WEST]   = tmp;
    }
}