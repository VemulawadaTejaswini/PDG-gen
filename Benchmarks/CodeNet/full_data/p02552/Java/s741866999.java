public class Main{

	public static void main(String[] args){


		long a = Long.getLong(args[0]);
		long b = Long.getLong(args[1]);
		long c = Long.getLong(args[2]);
		long d = Long.getLong(args[3]);

		long answer=0;

		if(Math.multiplyExact(a, c) > answer) {
			answer = Math.multiplyExact(a, c);
		}
		if(Math.multiplyExact(a, d) > answer) {
			answer = Math.multiplyExact(a, d);
		}

		if(Math.multiplyExact(b, c) > answer) {
			answer = Math.multiplyExact(a, c);
		}
		if(Math.multiplyExact(b, d) > answer) {
			answer = Math.multiplyExact(a, d);
		}
		System.out.print(answer);
	}

}