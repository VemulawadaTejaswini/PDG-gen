import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int count = Integer.parseInt(br.readLine());
        String[] strArray = new String[count];
        strArray = br.readLine().split(" ");

        int max=-1000000, min=1000000, sum=0;
        int a = 0;

        for(String str : strArray) {
        	a = Integer.parseInt(str);
        	max = Math.max(max, a);
        	min = Math.min(min, a);
        	sum += a;
        }

        System.out.println(min + " " + max + " " + sum);
	}
}