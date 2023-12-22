import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");

        int[] data = new int[line.length];
        for (int i = 0; i < data.length; i++) {
        	data[i] = Integer.parseInt(line[i]);
		}


        StringBuilder sb = new StringBuilder();
        int roopCout = Integer.parseInt(br.readLine());
        for (int i = 0; i < roopCout; i++) {
        	String[] d = br.readLine().split(" ");
        	int top = Integer.parseInt(d[0]);
        	int front = Integer.parseInt(d[1]);

            Dice dice = new Dice(data);
        	dice.moveTop(top);
        	dice.turnFront(front);
        	sb.append(dice.getRight()).append("\n");
        }
        System.out.print(sb.toString());
    }
}

class Dice {

	HashMap<String, Integer> pos;
	Dice(int[] data) {
		pos = new HashMap<String, Integer>();
		pos.put("top"   , data[1 - 1]);
		pos.put("bottom", data[6 - 1]);
		pos.put("left"  , data[4 - 1]);
		pos.put("right" , data[3 - 1]);
		pos.put("front" , data[2 - 1]);
		pos.put("back"  , data[5 - 1]);
	}

	public void turnFront(int frontData) {
		String strPos = "";
		Iterator<HashMap.Entry<String, Integer>> ite = pos.entrySet().iterator();
		while(ite.hasNext()) {
            Map.Entry<String, Integer> entry = ite.next();

			if (frontData == entry.getValue()) {
				strPos = entry.getKey();
				break;
			}
		}

		switch (strPos) {
		case "front":
			break;

		case "bottom":
			break;

		case "right":
			turnRight();
			break;

		case "left":
			turnLeft();
			break;

		case "back":
			turnLeft();
			turnLeft();
			break;
		}
	}

	public void moveTop(int topData) {
		String strPos = "";
		Iterator<HashMap.Entry<String, Integer>> ite = pos.entrySet().iterator();
		while(ite.hasNext()) {
            Map.Entry<String, Integer> entry = ite.next();

			if (topData == entry.getValue()) {
				strPos = entry.getKey();
				break;
			}
		}

		switch (strPos) {
		case "top":
			break;

		case "bottom":
			move('S');
			move('S');
			break;

		case "left":
			move('E');
			break;

		case "right":
			move('W');
			break;

		case "front":
			move('N');
			break;

		case "back":
			move('S');
			break;
		}
	}

	public void move(char m) {
		int temp = -1;
		switch (m) {
		case 'N':
			temp = pos.get("top");
			pos.put("top"   , pos.get("front"));
			pos.put("front" , pos.get("bottom"));
			pos.put("bottom", pos.get("back"));
			pos.put("back"  , temp);

			break;

		case 'E':
			temp = pos.get("top");
			pos.put("top"    , pos.get("left"));
			pos.put("left"   , pos.get("bottom"));
			pos.put("bottom" , pos.get("right"));
			pos.put("right"  , temp);

			break;

		case 'W':
			temp = pos.get("top");
			pos.put("top"    , pos.get("right"));
			pos.put("right"  , pos.get("bottom"));
			pos.put("bottom" , pos.get("left"));
			pos.put("left"   , temp);

			break;

		case 'S':
			temp = pos.get("top");
			pos.put("top"    , pos.get("back"));
			pos.put("back"   , pos.get("bottom"));
			pos.put("bottom" , pos.get("front"));
			pos.put("front"  , temp);

			break;
		}
	}

	public void turnLeft() {
		int temp = -1;
		temp = pos.get("front");
		pos.put("front" , pos.get("left"));
		pos.put("left"  , pos.get("back"));
		pos.put("back"  , pos.get("right"));
		pos.put("right" , temp);
	}

	public void turnRight() {
		int temp = -1;
		temp = pos.get("front");
		pos.put("front" , pos.get("right"));
		pos.put("right" , pos.get("back"));
		pos.put("back"  , pos.get("left"));
		pos.put("left"  , temp);
	}

	public int getRight() {
		return pos.get("right");
	}
}