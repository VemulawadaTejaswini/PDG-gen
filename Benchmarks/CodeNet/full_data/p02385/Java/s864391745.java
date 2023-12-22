import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num1 = new int[6];
        int[] num2 = new int[6];

        for(int i = 0; i < num1.length; i++) {
        	num1[i] = sc.nextInt();
        }
        for(int i = 0; i < num2.length; i++) {
        	num2[i] = sc.nextInt();
        }
        Dice dice1 = new Dice(num1);
        Dice dice2 = new Dice(num2);

        if(dice1.setTop(num1[0]) && dice2.setTop(num1[0])) {
        	if(dice1.setFront(num1[1]) && dice2.setFront(num1[1])) {
        		if(dice1.getRight() == dice2.getRight()
        				&& dice1.getRight() == dice2.getRight()
                		&& dice1.getLeft() == dice2.getLeft()
                        && dice1.getBack() == dice2.getBack()
                        && dice1.getBottom() == dice2.getBottom())
        		{
        			System.out.println("Yes");
        		} else {
                	System.out.println("No");
        		}


        	} else {
            	System.out.println("No");
        	}

        } else {
        	System.out.println("No");
        }

    }
}

class Dice {
	private int top;
    private int front;
    private int right;
    private int left;
    private int back;
    private int bottom;

    Dice(int[] num) {
    	top = num[0];
    	front = num[1];
    	right = num[2];
    	left = num[3];
    	back = num[4];
    	bottom = num[5];
    }

    void change(char dir) {
    	switch(dir) {
    	case 'N' : moveN(); break;
    	case 'S' : moveS(); break;
    	case 'E' : moveE(); break;
    	case 'W' : moveW(); break;
    	}
    }

    boolean setTop(int top) {
    	if(top != this.top) {
    		if(top == this.front) {
    			moveN();
    		} else if(top == this.right) {
    			moveW();
    		} else if(top == this.left) {
    			moveE();
    		} else if(top == this.back) {
    			moveS();
    		} else if(top == this.bottom) {
    			moveS();
    			moveS();
    		} else {
    			return false;
    		}
    	}
    	return true;
    }

    boolean setFront(int front) {
    	int count = 0;
    	while(count < 4) {
    		if(front == this.front) {
    			return true;
    		}
    		moveClockwise();
    		count++;
    	}
    	return false;
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
    void moveClockwise() {
    	int temp = front;
    	front = right;
    	right = back;
    	back = left;
    	left = temp;
    }

    int getTop() {
    	return top;
    }
    int getFront() {
    	return front;
    }
    int getRight() {
    	return right;
    }
    int getLeft() {
    	return left;
    }
    int getBack() {
    	return back;
    }
    int getBottom() {
    	return bottom;
    }
}
