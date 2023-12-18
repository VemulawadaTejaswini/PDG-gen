import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		char[] array = input.toCharArray();
		int count[] = new int[3];
		for(int i = 0; i < array.length; i++){
			count[array[i]-'a']++;
		}

		Arrays.sort(count);

		if(array.length == 1){
			System.out.println("YES");
		}
		else if(array.length == 2){
			if(array[0] == array[1]){
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
		}
		else if(array.length == 3){
			if(count[2] == 2){
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
		}
		else {
			if(array.length % 3 == 0){
				if(count[0] == count[1] && count[1] == count[2]){
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}

			else if(array.length % 3 == 1){
				if(count[0] == count[1] && count[1] + 1 == count[2]){
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			else {
				if(count[1] == count[2] && count[0] + 1 == count[1]){
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
		}

	}

}
