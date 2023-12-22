import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String num = br.readLine();

		StringBuilder bf = new StringBuilder();

		for(int i=0; i<Integer.parseInt(num);i++){


		String[] str = br.readLine().split(" ");

		Arrays.sort(str);

		int num1 = Integer.parseInt(str[0]);
		int num2 = Integer.parseInt(str[1]);
		int num3 = Integer.parseInt(str[2]);

		if(num3*num3 == num2*num2+num1*num1){
			bf.append("YES").append("\n");
		}else {
			bf.append("NO").append("\n");

		}

		}

		System.out.println(bf);


	}

}