import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String args[]) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String sc="";
		while(true) {
			sc=br.readLine();
			int yakusu=Integer.parseInt(sc);
			int bunkatu=600/yakusu;

			long ans=0;
			for(int i=0; i<bunkatu; i++) {
				ans+=(yakusu*i)*(yakusu*i)*yakusu;
			}
			System.out.println(ans);
		}
	}
}
