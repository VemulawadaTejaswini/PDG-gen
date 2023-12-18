import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int pointSum = 0;
		scanner.useDelimiter("[\r\n]+");
        scanner = new Scanner(new StringReader(scanner.next()));
        List<Integer> users = new ArrayList<>();
        while(scanner.hasNextInt()) {
        	int user = scanner.nextInt();
        	users.add(user);
        	pointSum += user;
        }
        int middle = pointSum / num;
        if((pointSum % num) > ((double)num / 2) ) {
        	middle++;
        }
        long sum = 0;
        for(Integer u : users) {
        	sum += Math.pow(u - middle, 2);
        }
		System.out.println(sum);
	}

}