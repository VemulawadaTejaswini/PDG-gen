import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			int i = 0;
			int j;
			int x[] = new int[100];


		try {


			String line = reader.readLine();
			String[] strAry = line.split("\\s+");
			while(true)
			{
				x[i] = Integer.parseInt(strAry[0]);
				if (x[i] == 0) break;
				System.out.printf("Case %d: %d\n",i+1,x[i]);
				line = reader.readLine();
				strAry = line.split("\\s+");
				i++;
			}


		} catch (IOException e) {
			System.out.println(e);
		}

	}
}