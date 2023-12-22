import java.util.*;

public class Main{

    private static Dice dice1;
    private static Dice dice2;

    public static void main(String... args) {
        readStanderdInput();
        DiceOperator diceOperator = new DiceOperator();
        System.out.println(diceOperator.isSame(dice1, dice2) ? "Yes" : "No" );
    }


    private static void readStanderdInput() {
        Scanner s = new Scanner(System.in);
        dice1 = new Dice(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt());
        s.nextLine();
        dice2 = new Dice(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt());
        s.nextLine();
        s.close();
    }
}

class DiceOperator {

    void roll(Dice dice, List<Instruction> instructions){

        for (Instruction instruction : instructions){
            switch (instruction) {
                case EAST:
                    dice.rollToEast();
                    break;
                case WEST:
                    dice.rollToWest();
                    break;
                case NORTH:
                    dice.rollToNorth();
                    break;
                case SOUTH:
                    dice.rollToSouth();
            }
        }
    }

    public Dice rollDiceTopAndFrontTo(int top, int front, Dice dice) {

        roll_front_loop:
        while (true) {
            for (int i = 0; i < 4; i++) {
                dice.rollToSouth();
                if (front == dice.front()) break roll_front_loop;
            }
            dice.rollToWest();
        }

        while (true) {
            if (top == dice.top()) break;
            dice.rollToWest();
        }

        return dice;
    }

    public boolean isSame(Dice dice1, Dice dice2) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (dice1.equals(dice2)) return true;
                dice2.rotateToRight();
            }
            dice2.rollToWest();
        }
        return true;
    }
}

class Dice implements Cloneable {

    private static final String TOP = "TOP";
    private static final String FRONT = "FRONT";
    private static final String LEFT = "LEFT";
    private static final String RIGHT = "RIGHT";
    private static final String BACK = "BACK";
    private static final String BOTTOM = "BOTTOM";

    private Map<String, Integer> positions = new HashMap<>();

    Dice(int top, int front, int left, int right, int back, int bottom) {
        setPositions(top, front, left, right, back, bottom);
    }

    void rollToWest() {
        setPositions(positions.get(LEFT), positions.get(FRONT), positions.get(BOTTOM), positions.get(TOP), positions.get(BACK), positions.get(RIGHT));
    }

    void rollToEast() {
        setPositions(positions.get(RIGHT), positions.get(FRONT), positions.get(TOP), positions.get(BOTTOM), positions.get(BACK), positions.get(LEFT));
    }

    void rollToNorth() {
        setPositions(positions.get(FRONT), positions.get(BOTTOM), positions.get(LEFT), positions.get(RIGHT), positions.get(TOP), positions.get(BACK));
    }


    void rollToSouth() {
        setPositions(positions.get(BACK), positions.get(TOP), positions.get(LEFT), positions.get(RIGHT), positions.get(BOTTOM), positions.get(FRONT));
    }

    void  rotateToRight() {
        setPositions(positions.get(TOP), positions.get(LEFT), positions.get(BACK), positions.get(FRONT), positions.get(RIGHT), positions.get(BOTTOM));
    }

    private void setPositions(int top, int front, int left, int right, int back, int bottom){
        positions.put(TOP, top);
        positions.put(FRONT, front);
        positions.put(LEFT, left);
        positions.put(RIGHT, right);
        positions.put(BACK, back);
        positions.put(BOTTOM, bottom);
    }

    int top() {
        return positions.get(TOP);
    }

    int front() {
        return positions.get(FRONT);
    }

    int left() {
        return positions.get(LEFT);
    }

    int right() {
        return positions.get(RIGHT);
    }

    int back() {
        return positions.get(BACK);
    }

    int bottom() {
        return positions.get(BOTTOM);
    }

    boolean equals(Dice dice) {

        if (!(this.top() == dice.top())) return false;
        if (!(this.left() == dice.left())) return false;
        if (!(this.right() == dice.right())) return false;
        if (!(this.front() == dice.front())) return false;
        if (!(this.back() == dice.back())) return false;
        if (!(this.bottom() == dice.bottom())) return false;

        return true;
    }
}

enum Instruction {
    EAST,
    WEST,
    SOUTH,
    NORTH,
}