import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] temp = new String[5];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = sc.nextLine();
		}
		int[] stn = new int[5];
		int not=0;
		double weight, tall, bmi;
		for (int i = 0; i < temp.length; i++) {
			String[] str = temp[i].split(",");
			stn[i] = Integer.parseInt(str[0]);
			weight = Double.parseDouble(str[1]);
			tall = Double.parseDouble(str[2]);
			bmi = weight / Math.pow(tall, 2);
			if(bmi >= 25) System.out.println(stn[i]);
			else not++;
		}
		if(not == 5)System.out.println("????????????");
	}
}