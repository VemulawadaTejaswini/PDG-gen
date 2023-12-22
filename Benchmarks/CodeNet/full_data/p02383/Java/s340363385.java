import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");

        int[] data = new int[line.length];
        for (int i = 0; i < data.length; i++) {
        	data[i] = Integer.parseInt(line[i]);
		}

        Dice dice = new Dice(data);

        char[] moveData = br.readLine().toCharArray();
        for (int i = 0; i < moveData.length; i++) {
        	dice.move(moveData[i]);
        }

        System.out.println(dice.getTop());
    }
}

class Dice {
	private int top;
	private int bottom;
	private int left;
	private int right;
	private int front;
	private int back;


	Dice(int[] data) {
		this.top    = data[1 - 1];
		this.bottom = data[6 - 1];
		this.left   = data[4 - 1];
		this.right  = data[3 - 1];
		this.front  = data[2 - 1];
		this.back   = data[5 - 1];
	}

	public void move(char m) {
		int temp = -1;
		switch (m) {
		case 'N':
			temp = this.top;
			this.top    = this.front;
			this.front  = this.bottom;
			this.bottom = this.back;
			this.back   = temp;

			break;

		case 'E':
			temp = this.top;
			this.top    = this.left;
			this.left   = this.bottom;
			this.bottom = this.right;
			this.right  = temp;

			break;

		case 'W':
			temp = this.top;
			this.top    = this.right;
			this.right  = this.bottom;
			this.bottom = this.left;
			this.left   = temp;

			break;

		case 'S':
			temp = this.top;
			this.top    = this.back;
			this.back   = this.bottom;
			this.bottom = this.front;
			this.front  = temp;

			break;
		}
	}

	public int getTop() {
		return this.top;
	}
}