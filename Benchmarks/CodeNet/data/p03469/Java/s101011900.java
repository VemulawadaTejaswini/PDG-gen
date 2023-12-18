public class Main{

	public static void main(String[] args) {
		String first=new String(args[0]);
		StringBuilder sb=new StringBuilder();
		sb.append(first);
		sb.delete(0, 4);
		sb.insert(0, "2018");
		System.out.println(sb);
	}
}
