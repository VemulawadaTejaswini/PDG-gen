import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] face1 = input.split(" ");
        input = br.readLine();
        String[] face2 = input.split(" ");

        Dice one = new Dice();
        Dice two = new Dice();

        one.setFace(face1);
        two.setFace(face2);

		String top = one.getTop();
		String front = one.getFront();
        String right = one.getRight();
        String left = one.getLeft();
        String back = one.getBack();
        String bottom = one.getBottom();


		for (int j = 0; j < 3; j++) {
			if (two.getTop().equals(top)) {
				break;
			}
			two.roll("S");
		}

		for (int k = 0; k < 3; k++) {
			if (two.getTop().equals(top)) {
				break;
			}
			two.roll("W");
		}


		for (int l = 0; l < 3; l++) {
			if (two.getFront().equals(front)) {
				break;
			}
			two.roll("WSE");
		}

		if (two.getRight().equals(right) && two.getLeft().equals(left) && two.getBack().equals(back) && two.getBottom().equals(bottom)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
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

    public String getFront() {
    	return this.front;
    }

    public String getRight() {
    	return this.right;
    }

    public String getLeft() {
    	return this.left;
    }

    public String getBack() {
    	return this.back;
    }

    public String getBottom() {
    	return this.bottom;
    }

}

