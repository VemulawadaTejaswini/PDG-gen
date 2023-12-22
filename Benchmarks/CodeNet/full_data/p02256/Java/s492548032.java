import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static int x;
	public static int y;
	public static int z;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = br.readLine().split(" ");
		x= Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);
		if(x > y){
			solve(x,y);
		}
		else{
			solve(y,x);
		}
		System.out.println(z);

	}

	public static void solve(int big,int small){
		z = big % small;
		if (z == 0){
			z = small;
		}
		else{
			solve(small,z);
		}

	}

}