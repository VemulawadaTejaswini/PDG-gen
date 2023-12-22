import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        // fill in the dictionary with the initial value
        int[] values = new int[6];
        for(int i = 0; i < 6; i++){
            values[i] = f.nextInt();
        }
        Dice dice = new Dice(values);
        String movements = f.nextLine();
        String movements2 = f.nextLine();
        char[] s = movements2.toCharArray();
        for(char direction : s){
            dice.roll(direction);
        }
        System.out.println(dice.getTop());
    }
}
class Dice {
    int one;
    int two;
    int three;
    int four;
    int five;
    int six;
    public Dice(int[] values){
        this.one = values[0];
        this.two = values[1];
        this.three = values[2];
        this.four = values[3];
        this.five = values[4];
        this.six = values[5];
    }

    public void roll(char s){
        switch (s){
            case 'E': this.east(); break;
            case 'W': this.west(); break;
            case 'S': this.south(); break;
            case 'N': this.north(); break;
        }
    }

    public void east(){
        int temp = this.six;
        this.six = this.three;
        this.three = this.one;
        int temp2 = this.four;
        this.four = temp;
        this.one = temp2;
    }

    public void west(){
        int temp = this.six;
        this.six = this.four;
        this.four = this.one;
        int temp2 = this.three;
        this.three = temp;
        this.one = temp2;
    }

    public void south(){
        int temp = this.two;
        this.two = this.one;
        this.one = this.five;
        int temp2 = this.six;
        this.six = temp;
        this.one = temp2;
    }

    public void north(){
        int temp = this.two;
        this.two = this.six;
        this.six = this.five;
        int temp2 = this.one;
        this.one = temp;
        this.five = temp2;
    }

    public int getTop(){
        return this.one;
    }
}
