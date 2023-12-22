import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] face = input.split(" ");
        String direction = br.readLine();

        Dice dice = new Dice();
        dice.setFace(face);
        dice.roll(direction);
        System.out.println(dice.getTop());
    }
}

class Dice {
    private String top;
    private String front;
    private String right;
    private String left;
    private String back;
    private String bottom;

    private char direction[];

    public void setFace(String[] face) {
        this.top = face[0];
        this.front = face[1];
        this.right = face[2];
        this.left = face[3];
        this.back = face[4];
        this.bottom = face[5];
    }

    public void roll(String directions) {
        this.direction = directions.toCharArray();

        String temp;
        for (int i = 0; i < direction.length; i++) {
            switch(direction[i]) {
                case 'N':
                    temp = this.top;
                    this.top = this.front;
                    this.front = this.bottom;
                    this.bottom = this.back;
                    this.back = temp;
                    break;
                case 'W':
                    temp = this.top;
                    this.top = this.right;
                    this.right = this.bottom;
                    this.bottom = this.left;
                    this.left = temp;
                    break;
                case 'E':
                    temp = this.top;
                    this.top = this.left;
                    this.left = this.bottom;
                    this.bottom = this.right;
                    this.right = temp;
                break;
                case 'S':
                    temp = this.top;
                    this.top = this.back;
                    this.back = this.bottom;
                    this.bottom = this.front;
                    this.front = temp;
                    break;
            }

        }

    }

    public String getTop() {
        return this.top;
    }

}

