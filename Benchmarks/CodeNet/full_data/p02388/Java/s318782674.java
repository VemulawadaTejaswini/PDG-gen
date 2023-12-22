import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String head;
		try {
			head = br.readLine();
		} catch (IOException e) {
			System.err.println("The input is missing. " + e.getMessage());
			return;
		}

        int n;
        try {
        	n= Integer.parseInt(head);
        } catch(NumberFormatException e) {
			System.err.println("The input is in an illegal form. " + e.getMessage());
			return;
        }

        System.out.println(n*n*n);
    }
}