import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        final String[] WEATHER = {"Sunny" , "Cloudy", "Rainy"};

        int index = -1;
        for(int i = 0; i < WEATHER.length; i++) {
        	if(WEATHER[i].equals(s)) {
        		index = i;
        		break;
        	}
        }

        String ans = WEATHER[ (index+1) % WEATHER.length ];
        System.out.println(ans);
	}
}