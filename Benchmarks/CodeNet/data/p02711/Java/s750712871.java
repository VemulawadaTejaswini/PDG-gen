import java.util.Random;

public class LuckySeven {

	public static void main(String[] args) {
		int max=999;
		int min=100;
		Random random = new Random();
		int N= random.nextInt(max)%(max-min+1)+min;
		System.out.println(N);
		String str= Integer.toString(N);
		if(str.contains("7")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

}
}