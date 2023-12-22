import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String args[]) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String sc1;
		String sc2;
		char[] moji1=new char[80];
		char[] moji2=new char[80];
		int[] wa=new int[80];
		int kuriagari=0;
		int souwa=0;
		String res="";

		while(true) {
			sc1=br.readLine();
			sc2=br.readLine();
			if(sc1.length()>=81 || sc2.length()>=81) {
				System.out.println("overflow");
			}

			else {
				StringBuffer sb=new StringBuffer(sc1);
				sc1=sb.reverse().toString();
				sb=new StringBuffer(sc2);
				sc2=sb.reverse().toString();

				for(int i=0; i<80; i++) {
					moji1[79-i]=sc1.charAt(i);
					moji2[79-i]=sc2.charAt(i);
				}

				for(int i=0; i<79; i++) {
					souwa= (Character.getNumericValue(moji1[79-i]))+(Character.getNumericValue(moji1[79-i]));
					wa[79-i]=kuriagari+souwa%10;
					kuriagari=souwa/10;
				}

				souwa= (Character.getNumericValue(moji1[0]))+(Character.getNumericValue(moji1[0]));
				wa[0]=kuriagari+souwa%10;
				kuriagari=souwa/10;
				if(kuriagari>0) {
					System.out.println("overflow");
				}

				else {
					for(int i=79; i>=0; i--) {
						res=wa[i]+""+res;
					}
					System.out.println(res);
				}
			}
		}

	}
}
