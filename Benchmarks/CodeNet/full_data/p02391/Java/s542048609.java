import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            String[] num = line.split(" ", -1);
            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[1]);
            if(a < b) {
                System.out.println("a < b");
            }else if(a > b) {
		System.out.println("a > b");
            }else {
                System.out.println("a == b");
            }
	} catch (IOException e) {
            System.out.println(e);
	} catch (NumberFormatException e) {
            System.out.println("error");
	}
    }
}