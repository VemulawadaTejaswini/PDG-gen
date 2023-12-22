import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

//		StackArray sa = new StackArray(1);
//		try {
//			sa.push(1);
//		} catch (Exception e) {
//			System.out.println("catch");
//		} finally {
//			System.out.println("final");
//		}
//		System.out.println("owari");

		Scanner sc = new Scanner(System.in);
		String[] data = sc.nextLine().split(" ");

		StackArray sa = new StackArray(data.length);

		int ans = 0;
		try
		{
			for (int i = 0; i < data.length; i++)
			{
				switch (data[i])
				{
				case "+":
					ans = sa.pop() + sa.pop();
					sa.push(ans);
					break;
				case "-":
					ans = - sa.pop() + sa.pop();
					sa.push(ans);
					break;
				case "*":
					ans = sa.pop() * sa.pop();
					sa.push(ans);
					break;
				default:
					sa.push( Integer.parseInt(data[i]) );
					break;
				}
			}
			System.out.println(sa.pop());
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

	static class StackArray {
		int[] S;

		int top = 0;

		StackArray(int length) {
			this.S = new int[length];
		}

		StackArray initialize() {
			this.top = 0;
			return this;
		}

		boolean isEmpty() {
			return this.top == 0;
		}

		boolean isFull() {
			return this.top >= this.S.length - 1;
		}

		StackArray push(int x) throws Exception {
			if (this.isFull()) {
				throw new Exception();
			}
			this.top++;
			S[this.top] = x;
			return this;
		}

		int pop() throws Exception {
			if (this.isEmpty()) {
				throw new Exception();
			}
			int x = S[top];
			top--;
			return x;
		}

	}
}