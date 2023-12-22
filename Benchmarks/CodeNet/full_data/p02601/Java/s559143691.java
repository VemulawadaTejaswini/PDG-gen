import java.util.*;
public class Main {
	public static void main(String[] args){
      
    	Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //red
        int b = sc.nextInt(); //green
        int c = sc.nextInt(); //blue
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {

            int value = new Random().nextInt(3);
            switch (value) {
                case 0:
                    a = a * 2;
                    break;
                case 1:
                    b = b * 2;
                    break;
                case 2:
                    c = c * 2;
                    break;
            }
        }

        String result = "No";
        if (b > a && c > b) {
            result = "Yes";
        }

        System.out.println(result);     

	}
}