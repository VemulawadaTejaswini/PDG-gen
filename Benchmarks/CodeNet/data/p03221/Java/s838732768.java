import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();

		List<City> citys = new ArrayList<>();
		int[] cityInPre = new int[n+1];
		for(int i=0;i<n+1;i++) {
			cityInPre[i]=0;
		}

		//double temp =0;
		//List<Double> list = new ArrayList<>();
		for(int i=0;i<m;i++) {
			City city = new City(i,sc.nextInt(),sc.nextInt());
			citys.add(city);
		}

		citys.sort((a,b) -> a.year-b.year);


		for(int i = 0;i<citys.size();i++) {
			citys.get(i).number = cityInPre[citys.get(i).prefecture]+1;
			cityInPre[citys.get(i).prefecture]++;
		}

		citys.sort((a,b) -> a.order-b.order);

		for(int i = 0;i<citys.size();i++) {
			String s = "";
			for(int j=0;j<5-Math.floor(Math.log10(citys.get(i).prefecture));j++) {
				s = s+"0";
			}
			s = s + Integer.toString(citys.get(i).prefecture);
			for(int j=0;j<5-Math.floor(Math.log10(citys.get(i).number));j++) {
				s = s+"0";
			}
			s = s + Integer.toString(citys.get(i).number);
			System.out.println(s);
		}


	}

}

class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}