public class Main{

	public static void main(String[] args) {
		String first=new String(args[0]);
		StringBuilder sb=new StringBuilder();
		sb.append(first);
		sb.replace(0, 4, "2018");
		System.out.println(sb);
	}
}
