import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			List<Product> points = new ArrayList<>();
			for(int i=0;i<n;i++) {
				points.add(new Product(sc.nextInt(), sc.nextInt(), sc.next().charAt(0), sc.nextLong(), sc.next()));
			}
			points.sort((p1, p2) -> {
				int compare = p1.value - p2.value;
				if(compare == 0) {
					compare = p1.weight - p2.weight;
					if(compare == 0) {
						compare = p1.type - p2.type;
						if(compare == 0) {
							compare = (int)(p1.date - p2.date);
							if(compare == 0) {
								compare = p1.name.compareTo(p2.name);
							}
						}
					}
				}
				return compare;
			});
			points.forEach(product -> System.out.println(
						product.value + " " + product.weight + " " + product.type + " " + product.date + " " + product.name
					));
		}
	}
	static class Product{
		public int value;
		public int weight;
		public char type;
		public long date;
		public String name;
		public Product(int value, int weight, char type, long date, String name) {
			this.value = value;
			this.weight = weight;
			this.type = type;
			this.date = date;
			this.name = name;
		}
	}
}
