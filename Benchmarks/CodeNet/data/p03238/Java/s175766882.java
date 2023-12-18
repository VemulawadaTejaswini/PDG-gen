public class Main {
	public static void main(String[] args) {

		int i0 = Integer.parseInt(args[0]);

		if(i0 == 1){
			System.out.println("Hello World");
			return;
		}else if(i0==2) {
			int i1 = Integer.parseInt(args[1]);
			int i2 = Integer.parseInt(args[2]);

			System.out.println(i1+i2);
			return;

		}
	}
}