public class main {
	public static void main(String[] args) {


		int motode = 100;
		int i=0;


		int mokuhyo = Integer.parseInt(args[0]);
		while(mokuhyo>motode){

			motode= (int) Math.floor(motode*1.01);

					++i	;
		}
		System.out.println(i);
	}
