public class Main {
	public static void main (String[] args) {
	//	Scanner sc = new Scanner(System.in);
		int A = 46979;
		int intAns = 0;
		int intAns1 = 0;
		int intH = 3600;
		int intM = 60;
		int intS = 1;
			intAns = A / intH;
			int intAmari = A % intH;
			intAns1 = intAmari / intM;
			intAmari = intAmari % intM;
			System.out.println(intAns+":"+intAns1+":"+intAmari);
	}
}