import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true){
		String data[] = reader.readLine().split(" ");

		//????????¨????????????????????\???
		int a = Integer.parseInt(data[0]);
		int b = Integer.parseInt(data[1]);

		//????????¨???????????????0????????????
		if(a==0 && b==0)
			break;
		for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                 if ((i + j) %2 == 0) {
                      System.out.print('#');
                 } else {
                      System.out.print('.');
                 }
            }
            System.out.println();
	 }
	}
  }
}