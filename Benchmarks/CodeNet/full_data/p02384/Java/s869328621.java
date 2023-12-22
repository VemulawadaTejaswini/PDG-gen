import java.util.*;

public class Main{

    private static int top;
    private static int front;
    private static int left;
    private static int right;
    private static int back;
    private static int bottom;
    private static int questionCount;
    private static List<Question> questions = new ArrayList<>();

    private static Map<Character, Instruction> directionEnumMap = new HashMap<>();

    public static void main(String... str) {

        readStanderdInput();

        DiceOperator diceOperator = new DiceOperator();

        for (Question q: questions) {
            System.out.println(diceOperator.rollDiceTopAndFrontTo(q.top, q.front, new Dice(top, front, left, right, back, bottom)).left());
        }
    }

    private static void readStanderdInput() {
        Scanner scanner = new Scanner(System.in);
        top = scanner.nextInt();
        front = scanner.nextInt();
        left = scanner.nextInt();
        right = scanner.nextInt();
        back = scanner.nextInt();
        bottom = scanner.nextInt();
        scanner.nextLine();
        questionCount = scanner.nextInt();
        scanner.nextLine();

        for (int i  = 0; i < questionCount; i++) {
            questions.add(new Question(scanner.nextInt(), scanner.nextInt()));
            scanner.nextLine();
        }
        scanner.close();
    }

    static class Question {
        int top;
        int front;

        Question(int top, int front) {
            this.top = top;
            this.front = front;
        }
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

}



class Dice {

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
}

enum Instruction {
    EAST,
    WEST,
    SOUTH,
    NORTH,
}