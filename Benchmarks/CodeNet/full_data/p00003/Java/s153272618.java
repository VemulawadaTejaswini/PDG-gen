import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < count; i++) {
			String str = br.readLine();
			String[] str1Ary = str.split(" ");
			int[] intAry = {Integer.parseInt(str1Ary[0]), Integer.parseInt(str1Ary[1]), Integer.parseInt(str1Ary[2])};
			Arrays.sort(intAry);
			if(intAry[0]*intAry[0] + intAry[1]*intAry[1] == intAry[2]*intAry[2]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}