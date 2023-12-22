import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			String inBall = "A";
			while (sc.hasNext()) {
				String[] cup = sc.next().split(",");
				if(inBall.equals(cup[0])){
					inBall = cup[1];
				}else if(inBall.equals(cup[1])){
					inBall = cup[0];
				}
			}
			System.out.println(inBall);

		} finally {
			sc.close();
		}
	}
}