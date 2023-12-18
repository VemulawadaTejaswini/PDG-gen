import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public class Restaurant{
		int point = 0 ;
		String city = "" ;
		int No = 0 ;
		public int getPoint() {
			return point;
		}
		public void setPoint(int point) {
			this.point = point;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getNo() {
			return No;
		}
		public void setNo(int no) {
			No = no;
		}

	}

	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() { ;
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		Restaurant restaurants[] = new Restaurant[N];
//		List<Restaurant> list = new ArrayList<Restaurant>() ;
//		String S[] = new String[N];
//		int P[] = new int[N];

		Comparator c = new Comparator<Restaurant>() {
            @Override
            public int compare(Restaurant obj1, Restaurant obj2) {
            	int cmp = obj1.getCity().compareTo(obj2.getCity()) ;
            	if(cmp != 0 ) {
            		return cmp ;
            	}
                return obj2.getPoint() - obj1.getPoint();
            }
        };
		for(int i = 0 ; i < N ; i ++) {
			restaurants[i] = this.new Restaurant() ;
			restaurants[i].setCity(sc.next());
			restaurants[i].setPoint(sc.nextInt());
			restaurants[i].setNo(i + 1);
//			list.add(restaurants[i]) ;
		}
		Arrays.sort(restaurants,c);
//		System.out.println("N=" + N);
//		for(int i = 0 ; i < N ; i ++) {
			//System.out.println("S[" + (i+1) + "]=" + restaurants[i].getCity() + ",P[" + (i+1) + "]=" + restaurants[i].getPoint());
//			restaurants[i].setPage(i+1);
//		}
		for(int i = 0 ; i < N ; i ++) {
			System.out.println(restaurants[i].getNo());
		}

		// 出力
		//System.out.println(pi);

	}

}
