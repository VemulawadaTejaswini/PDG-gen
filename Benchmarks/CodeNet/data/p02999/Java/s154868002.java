package Test;

public class A {

	public static void main(String[] args) {
		int integ[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int A = integ[(int) (Math.random() * 10)];
		int X = integ[(int) (Math.random() * 10)];
			System.out.println("随机数为："+(int) (Math.random() * 10));
			System.out.println("A为：" + A + "X为：" + X);
		if (X < A) {
			System.out.println(0);
		} else {
			System.out.println(10);
		}
	}
}
