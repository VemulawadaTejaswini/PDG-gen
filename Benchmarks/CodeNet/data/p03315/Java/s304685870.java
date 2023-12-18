import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		Long n = as.nextLong();

		float min = 9999;

		for(int i=1;i<=n;i++) {
			String i2 = Integer.toString(i);

			String[] strArray = i2.split("");

			long tmp2 = 0;

			for(int j=0;j<strArray.length;j++) {
				tmp2 += Integer.parseInt(strArray[j]);
			}

			float tmp3 = tmp2/i;

			if(tmp3<= min) {
				System.out.println(i);
				min = tmp3;
			}

		}





	}
}