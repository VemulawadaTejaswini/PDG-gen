import java.util.Random;

public class Contest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
Random rand = new Random();
int X = rand.nextInt(99999)+1;
int number = rand.nextInt(99)+1;
int total = 500*number;
if(total >= X) {
	System.out.println("Yes");
}else {
	System.out.println("No");
}
System.out.println(total);
System.out.println(X);
	}

}