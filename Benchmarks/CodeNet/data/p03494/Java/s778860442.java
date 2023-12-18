import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		int kosu=0;
		String str="";
		str=bfr.readLine();
		kosu=Integer.parseInt(str);
		int[] suji=new int[kosu];
		str=bfr.readLine();
		String[] mtm=str.split(" ");
		int[] suzis=new int[kosu];
		int minx=32;
		for(int i=0; i<kosu; i++) {
			if(minx==1) {
				break;
			}
			else {
				suzis[i]=Integer.parseInt(mtm[i]);
				for(int j=0; j<33; j++) {
					if(suzis[i]%2==1 && minx>j) {
						minx=j;
					}
					suzis[i]=suzis[i] >> 1;
				}
			}
		}
		System.out.println(minx);
	}
}