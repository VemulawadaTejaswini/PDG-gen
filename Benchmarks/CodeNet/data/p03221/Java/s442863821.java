import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		List<City> li = new ArrayList<>();

		Main x = new Main();
		for(int i=0;i<M;i++) {
			li.add(x.new City(sc.nextInt(),sc.nextInt(),i));
		}


		int[] nowKen = {0};
		int[] nowNum = {0};


		Comparator<City> cityComparator =
	       Comparator.comparing(City::getPre)
              .thenComparing(Comparator.comparing(City::getYear));

//		System.out.println("リストこっから");

		li.stream()
	        .sorted(cityComparator)
	        .peek(c ->{
	        	if(c.getPre() > nowKen[0]) {
	        		nowNum[0] = 0;
	        		nowKen[0] = c.getPre();
	        	}
	        	c.setMyNum(++nowNum[0]);
	        })
	        .sorted((a,b) -> a.getOrderId()-b.getOrderId())

	        .forEach(i -> System.out.println(i));

// 		System.out.println(li);
		sc.close();
	}

	public class City{
		private int pre;
		private int year;
		private int orderId;
		private int myNum;

		public City(int pre, int year,int orderId) {
			super();
			this.pre = pre;
			this.year = year;
			this.orderId = orderId;
		}

		public int getPre() {
			return pre;
		}
		public void setPre(int pre) {
			this.pre = pre;
		}
//		public int getYear(int x) {
//			return x;
//		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public int getMyNum() {
			return myNum;
		}
		public void setMyNum(int myNum) {
			this.myNum = myNum;
		}

		@Override
		public String toString() {
			// TODO 自動生成されたメソッド・スタブ
			return String.format("%06d%06d", this.getPre(),this.getMyNum());
//			return this.getPre() + this.getMyNum();
		}


	}
}
