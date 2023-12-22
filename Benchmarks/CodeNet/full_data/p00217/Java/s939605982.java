import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;


public class Main {

	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1);

	private String inputData = null;

	public String[] data = null;

	public int num = 0;

	public HashMap<Integer, Integer> humanData = new HashMap<Integer, Integer>();

	public int topId = -1;

	public int topLength = -1;

	public static void main(String[] args) {
		new Main().start();
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
				this.num = Integer.parseInt(this.data[0]);
			}

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
			while (itId.hasNext()) {
				int id = itId.next();
				if (topLength <= this.humanData.get(id)) {
					this.topId = id;
					this.topLength = this.humanData.get(id);
				}
			}
			System.out.println(this.topId + " " + this.topLength);

		}
	}

}