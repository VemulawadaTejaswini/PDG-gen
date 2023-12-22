import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String args[]){
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		String st="";
		int yakusu;
		int bunkatu;
		long ans;
		while(true) {

				try {
					st=sc.readLine();
					if(st==null) {
						System.exit(0);
					}

					yakusu=Integer.parseInt(st);
					bunkatu=600/yakusu;

					ans=0;
					for(int i=0; i<bunkatu; i++) {
						ans+=(yakusu*i)*(yakusu*i)*yakusu;
					}
					System.out.println(ans);

				} catch (IOException e) {

					System.exit(0);
				}
		}

	}
}
