
public class Main {
	public static void main(String[] args) {
		int needMoney = Integer.parseInt(args[0]);
		int haveMoney = Integer.parseInt(args[1]);
		int satisfyCount = Integer.parseInt(args[2]);

		int count = haveMoney / needMoney;
		if (count > satisfyCount) count = satisfyCount;

		System.out.println(count);
	}
}
