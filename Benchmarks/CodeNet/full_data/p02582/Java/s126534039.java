import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String weather = sc.next();

		int count = 0;
		//String sunny = 'S';

		for(int i=0; i<3; i++){
			if(weather.charAt(i) == 'S'){
				count++;
			}
			if(count == 3){
				count = 0;
			}
		}
		System.out.println(count);
	}
}
