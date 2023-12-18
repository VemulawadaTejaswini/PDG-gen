import java.util.Sccaner;
import java.util.Hashset;
 
public class Main{
 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Hashset set = new Hashset();
		set.add(sc.nextInt());
		set.add(sc.nextInt());
		set.add(sc.nextInt());
		System.out.println(set.size());
	}
}