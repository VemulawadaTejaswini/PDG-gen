import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));

			String[] line = br.readLine().split(" ");
			int[] list = new int[3];
			list[0] = Integer.parseInt(line[0]);
			list[1] = Integer.parseInt(line[1]);
			list[2] = Integer.parseInt(line[2]);

			boolean isSorted = false;
			while(!isSorted) {
				for(int i = 0; i < list.length - 1; i++) {
					int temp;
					if(list[i] > list[i+1]) {
						temp = list[i+1];
						list [i+1] = list [i];
						list [i] = temp;
					}
				}
				if(list[0] <=  list[1] && list[1] <= list[2]) {
					isSorted = true;
				}
			} 
			System.out.println(list[0] + " " + list[1] + " " + list[2]);
	}
}