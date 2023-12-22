public class A {
	public static void main(String[] args) {
		String S;
		if(S == "SSS")
			System.out.println("0");
		else if(S == "SSR" || "SRS" ||"RSS" || "RSR")
			System.out.println("1");
		else if(S == "SRR" || "RRS")
			System.out.println("2");
		else if(S == "RRR")
			System.out.println("3");

	}

}
