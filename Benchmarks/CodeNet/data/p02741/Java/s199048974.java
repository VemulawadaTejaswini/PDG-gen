
public class Main {
	
	public static void main(String[] args) {
		
		String n = "1,1,1,2,1,2,1,5,2,2,1,5,1,2,1,14,1,5,1,5,2,2,1,15,2,2,5,4,1,4,1,51";
		
		String[] in = n.split(",");
		
		int p = Integer.parseInt(args[0]);

		System.out.println(in[p - 1]);
	}

}
