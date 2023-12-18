public class Main {

	public static void main(String[] args) {
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int count = 0;
		for (int a_ = a; a_ <= 12; a_++) {
			for (int b_ = b; b_ <= 31; b_++) {
				if (a_ == b_) {
					// System.out.println("高橋: " + a_ + " " + b_);
					count++;
				}
			}
		}
		System.out.println(count);
	}
}