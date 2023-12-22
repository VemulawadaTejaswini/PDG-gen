import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buffer[] = new String[3];
		int array[] = new int[3];
		String ans;

		while(true){


			try {
				buffer = br.readLine().split("\\s+");
				for(int i = 0; i < buffer.length; i++){
					array[i] = Integer.parseInt(buffer[i]);
				}
				if(array[0] == -1 && array[1] == -1 && array[2] == -1)break;

				if(array[0] == -1 || array[1] == -1){
					ans = "F";
				}else if(array[0]+array[1] >= 80){
					ans = "A";
				}else if(array[0]+array[1] >= 65){
					ans = "B";
				}else if(array[0]+array[1] >= 50){
					ans = "C";
				}else if(array[0]+array[1] >= 30){
					if(array[2] >= 50){
						ans = "C";
					}else{
						ans = "D";
					}
				}else{
					ans = "F";
				}

				System.out.printf("%s\n", ans);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}


