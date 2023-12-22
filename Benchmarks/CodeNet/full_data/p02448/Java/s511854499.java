import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int i, j, n;
		List<Article> list = new ArrayList<Article>();
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			for(i = 0; i < n; i++) {
				Article article = new Article(sc.nextInt(),sc.nextInt(),sc.next(),sc.nextLong(),sc.next());
				list.add(article);
			}
			Comparator<Article> comparator =
					Comparator.comparing(Article::getValue)
					.thenComparing(Article::getHeight)
					.thenComparing(Article::gettype)
					.thenComparing(Article::getDate)
					.thenComparing(Article::getName);
			list.stream().sorted(comparator)
			.forEach(a ->
			System.out.println(a.getValue() + " " + a.getHeight() + " " + a.gettype()
			+ " " + a.getDate() + " " + a.getName()));
		}
	}
}
class Article {
	private int value;
	private int height;
	private String type;
	private long date;
	private String name;
	public Article(int value, int height, String type, long date, String name) {
		this.value = value;
		this.height = height;
		this.type = type;
		this.date = date;
		this.name = name;
	}
	public int getValue() {
		return this.value;
	}
	public int getHeight() {
		return this.height;
	}
	public String gettype() {
		return this.type;
	}
	public long getDate() {
		return this.date;
	}
	public String getName() {
		return this.name;
	}
}
