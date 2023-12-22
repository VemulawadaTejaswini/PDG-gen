import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] a) {
		
		List<Data> dataset = new ArrayList<Data>();
		
		while (true) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			if (n == 0) break;
		
			Data data = new Data(n);
			data.inputData(in);
			dataset.add(data);
		}
		
		for (Data t: dataset) {
			System.out.print(t.calcSum().toString());
		}
	}
}

class Data {
	
	private int[][] data;

	Data(int n) {
		int data[][] = new int[n][n];
		this.data = data;
	}
	
	public void inputData(Scanner in) {
		
		int n = this.data.length;
		
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				this.data[i][j] = in.nextInt();
	}
	
	public Data calcSum() {
		
		Data temp = new Data(this.data.length + 1);
		int n = temp.data.length;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < n - 1 && i < n - 1) {
					temp.data[i][j] = this.data[i][j];
					temp.data[i][n - 1] += temp.data[i][j];
					temp.data[n - 1][j] += temp.data[i][j];
					temp.data[n - 1][n - 1] += temp.data[i][j];
				}
			}
		}
		return temp;
	}
	
	public String toString() {
		
		StringWriter sw = new StringWriter();
		String s;
		int n = this.data.length;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == n - 1)
					sw.write(this.data[i][j] + "\n");
				else
					sw.write(this.data[i][j] + " ");
			}
		}
		sw.flush();
		s = sw.toString();
		return s;
	}
}