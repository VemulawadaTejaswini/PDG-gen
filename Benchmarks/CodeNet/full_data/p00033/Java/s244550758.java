
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n ;i++){
			int[] array = new int[10];
			String[] s = br.readLine().split(" ");
			for(int j =0 ;j < 10;j++){
				array[j] = Integer.parseInt(s[j]);
			}
            System.out.println(isSortable(array) ? "YES" : "NO");
		}
	}
	public static boolean isSortable(int[] ballSet) {
        int bufB = 0;
        int bufC = 0;
        for(int ball : ballSet) {
            if(ball > bufB) {
                bufB = ball;
            }
            else if(ball > bufC) {
                bufC = ball;
            }
            else {
                return false;
            }
        }
        return true;
    }

}