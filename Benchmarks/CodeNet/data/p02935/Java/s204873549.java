import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

		//double[] a = new double[n];
		double temp =0;
		List<Double> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(sc.nextDouble());
		}
		Collections.sort(list);

		temp = (list.get(0)+list.get(1))/2;
		for(int i =2; i<n;i++) {
			temp = (temp+list.get(i))/2;
		}
		System.out.println(temp);
	}

	}