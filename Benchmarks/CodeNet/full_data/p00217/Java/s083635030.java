import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class Main {

	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1);

	private String inputData = null;

	public String[] data = null;

	public int num = 0;

	public int count = 0;

	public HashMap<Integer, Integer> humanData = new HashMap<Integer, Integer>();

	public ArrayList<Integer> topId = new ArrayList<Integer>();

	public ArrayList<Integer> topLength = new ArrayList<Integer>();

	public static void main(String[] args) {
		new Main().start();
		System.exit(0);
	}

	public void start() {
		while (true) {
			try {
				this.inputData = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

			this.data = this.inputData.split(" ");

			if (this.data.length == 1) {
				if (this.data[0].equals("0")) {
					break;
				}
				try {
					this.num = Integer.parseInt(this.data[0]);
				} catch (Exception e) {
					continue;
				}

			}

			this.humanData.clear();

			for (int i = 0; i < this.num; i++) {
				try {
					this.inputData = reader.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				this.data = this.inputData.split(" ");

				this.humanData.put(Integer.parseInt(data[0]),
						Integer.parseInt(data[1]) + Integer.parseInt(data[2]));

			}

			Iterator<Integer> itId = this.humanData.keySet().iterator();
			int numCount = 0;
			while (itId.hasNext()) {
				int id = itId.next();
				if (numCount == 0) {
					this.topId.add(id);
					this.topLength.add(this.humanData.get(id));
				} else {
					if (this.topLength.get(count) <= this.humanData.get(id)) {
						this.topId.set(this.count, id);
						this.topLength.set(this.count, this.humanData.get(id));
					}
				}
				numCount++;
			}

			this.count++;

		}

		for (int i = 0; i < this.topId.size(); i++) {
			System.out.println(this.topId.get(i) + " " + this.topLength.get(i));
		}

	}

}