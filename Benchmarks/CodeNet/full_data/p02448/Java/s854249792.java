import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Product[] products = new Product[n];
		for (int i = 0; i < n; i++) {
		    products[i] = new Product(sc.nextInt(), sc.nextInt(), sc.next().charAt(0), sc.nextLong(), sc.next());
		}
		Arrays.sort(products);
		StringBuilder sb = new StringBuilder();
		for (Product p : products) {
		    sb.append(p).append("\n");
		}
		System.out.print(sb);
	}
	
	static class Product implements Comparable<Product> {
	    int value;
	    int weight;
	    char type;
	    long datetime;
	    String name;

	    public Product(int value, int weight, char type, long datetime, String name) {
    	    this.value = value;
    	    this.weight = weight;
    	    this.type = type;
    	    this.datetime = datetime;
    	    this.name = name;
	    }
	    
	    public int compareTo(Product another) {
	        if (value != another.value) {
	            return value - another.value;
	        } else if (weight != another.weight) {
	            return weight - another.weight;
	        } else if (type != another.type) {
	            return type - another.type;
	        } else if (datetime != another.datetime) {
	            if (datetime < another.datetime) {
	                return -1;
	            } else {
	                return 1;
	            }
	        } else {
	            return name.compareTo(another.name);
	        }
	    }
	    
	    public String toString() {
	        return value + " " + weight + " " + type + " " + datetime + " " + name;
	    }
	}
}

