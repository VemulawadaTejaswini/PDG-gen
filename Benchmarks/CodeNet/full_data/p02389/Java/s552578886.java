public class Main {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int y = sc.nextInt();

	    // 面積
	    int area = x * y;
	    // 周の長さ
	    int cf = x*2 + y*2;

	    System.out.println(area + " " + cf);
	}

}

