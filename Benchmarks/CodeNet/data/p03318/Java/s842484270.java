import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		long K = sc.nextLong();

		boolean go = false;

		long z = 1;

		for(long i = 1, t = 1; i<=K; i++){
			go = false;
			while(!go){
				if(t < 10) go=true;
				else if(t < (z*10)){
					if((t % z) == (z-1)) go=true;
				}
				if(!go) t += z;
			}
			System.out.println(t);
			if(((z*10)-1)==t){
				z*=10;
			}
			t += z;
		}

		sc.close();
    }
}