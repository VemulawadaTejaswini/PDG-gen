import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		BookStrategy strategy = new BookStrategy();


		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		int x = stdIn.nextInt();



		for (int i = 0; i < n; i++) {
			Book book = new Book(stdIn.nextInt());
			IntStream.range(0, m).forEach(j -> book.addSkill(stdIn.nextInt()));

			strategy.addBook(book);
		}

		System.out.println(strategy.getAllPattern(x));

		stdIn.close();
	}
}

class BookStrategy {
	private List<Book> bookList = new ArrayList<Book>();

	public void addBook(Book book) {
		bookList.add(book);
	}

	public int getAllPattern(int threshold) {
		int size = bookList.size();
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < (int)Math.pow(2, size); i++) {
			List<Integer> binaryArray = convertToBinary(i, size);

			int price = getPrice(binaryArray);

			if(!isOverThreshold(binaryArray, threshold)) {
				continue;
			}

			min = Integer.min(min, price);

		}

		if(min == Integer.MAX_VALUE) {
			return -1;
		}

		return min;

	}

	private int getPrice(List<Integer> binaryArray) {
		int total = 0;

		int size =binaryArray.size();

		for (int i = 0; i < size; i++) {
			total += bookList.get(i).getPrice() * binaryArray.get(i);

		}

		return total;
	}

	private boolean isOverThreshold(List<Integer> binaryArray, int x) {
		int[] skills = new int[bookList.get(0).getSkills().size()];

		int size =binaryArray.size();

		for (int i = 0; i < size; i++) {

			if(binaryArray.get(i) == 0) {
				continue;
			}

			List<Integer> inputSkills = bookList.get(i).getSkills();
			for(int j = 0; j < skills.length; j++) {
				skills[j] += inputSkills.get(j);
			}

		}

		for (int skill : skills) {
			if(skill < x) {
				return false;
			}
		}


		return true;
	}

	private List<Integer> convertToBinary(int num, int digit) {
		String binary = String.format("%"+digit+"s", Integer.toBinaryString(num)).replaceAll(" ", "0");
		List<Integer> flags = new ArrayList<Integer>();

		for (String bin : binary.split("")) {
			flags.add(Integer.parseInt(bin));
		}

		return flags;
	}
}

class Book {
	private int price;

	private List<Integer> skills = new ArrayList<>();

	public Book(int price) {
		this.price = price;
	}

	public void addSkill(int s) {
		skills.add(s);
	}

	public int getPrice() {
		return price;
	}

	public List<Integer> getSkills() {
		return skills;
	}


}