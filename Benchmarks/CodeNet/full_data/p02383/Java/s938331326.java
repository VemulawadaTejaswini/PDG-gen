import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[6];

        for(int i = 0; i < num.length; i++) {
        	num[i] = sc.nextInt();
        }

        Dice dice = new Dice();
        String com = sc.next();
        for(int i = 0; i < com.length(); i++) {
        	dice.change(com.charAt(i));
        }

        System.out.println(num[dice.getTop()-1]);
    }
}

class Dice {
	private int top = 1;
    private int front = 2;
    private int right = 3;
    private int left = 4;
    private int back = 5;
    private int bottom = 6;

    void change(char dir) {
    	switch(dir) {
    	case 'N' : moveN(); break;
    	case 'S' : moveS(); break;
    	case 'E' : moveE(); break;
    	case 'W' : moveW(); break;
    	}
    }

    void moveN() {
    	int temp = top;
    	top = front;
    	front = bottom;
    	bottom = back;
    	back = temp;
    }
    void moveS() {
    	int temp = top;
    	top = back;
    	back = bottom;
    	bottom = front;
    	front = temp;
    }
    void moveE(){
        int temp = top;
        top = left;
        left = bottom;
        bottom = right;
        right = temp;
    }
    void moveW(){
        int temp = top;
        top = right;
        right = bottom;
        bottom = left;
        left = temp;
    }

    int getTop() {
    	return top;
    }
}
