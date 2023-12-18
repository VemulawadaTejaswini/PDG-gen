import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] data = bf.readLine().split(" ");
		long rta = 0;
		long l,ai,aj,al;
		rta +=Long.parseLong(data[1]);
		aj= Long.parseLong(data[3]);
		al = Long.parseLong(data[4]);
		ai = Long.parseLong(data[0]);
		l = Math.min(aj, Math.min(ai, al));
		rta +=(l*3);
		al-=l; aj -=l; ai-=l;
		rta +=(al)-(al%2);
		rta +=(aj)-(aj%2);
		rta +=(ai)-(ai%2);
		System.out.println(rta);
	}
}
