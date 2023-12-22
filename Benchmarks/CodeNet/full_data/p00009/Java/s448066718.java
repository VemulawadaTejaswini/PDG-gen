import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(sc.hasNext()) {
			System.out.println(calc(sc.nextInt()));
		}
	}

	public static int calc(int num) {
		boolean[] search = new boolean[num+1];
        Arrays.fill(search, true);
        int count = 0;
        for(int i=2; i<Math.sqrt(num); i++){
            // ?´???°????????°?????????????????????
            if(!search[i]){
                continue;
            }

            // ?´???°????????°?????????????????¨???
            for(int j=2; i*j <= num; j++){
                search[i*j] = false;
            }
        }

        for(int i=2; i<search.length; i++){
            if(search[i]){
                count++;
            }
        }

        return count;
	}


}