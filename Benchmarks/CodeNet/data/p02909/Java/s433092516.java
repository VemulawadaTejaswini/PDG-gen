import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://atcoder.jp/contests/abc141/tasks/abc141_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine(); //Sは Sunny, Cloudy, Rainy のいずれかである
		sc.close();

        List<String> weatherList = new ArrayList<String>();
        weatherList.add("Sunny");
        weatherList.add("Cloudy");
        weatherList.add("Rainy");

        int index = (weatherList.indexOf(S)+1)%3;
        System.out.println(weatherList.get(index));

	}

}
