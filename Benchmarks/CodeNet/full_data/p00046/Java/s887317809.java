import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] hight = new double[5];
		for(int i = 0; i < 5; i++){
			hight[i] = sc.nextDouble();
		}
		double max = hight[0];
		double min = hight[0];
		for(int i = 0; i < 5; i++){
			if(max < hight[i]) max = hight[i];
			if(min > hight[i]) min = hight[i];
		}
		System.out.println(max - min);
	}
}