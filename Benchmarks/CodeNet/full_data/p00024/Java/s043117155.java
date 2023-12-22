import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		double hayasa;
		int kai=0;
		double byou;
		double takasa;
		boolean takai=false;
		try {
			str=bfr.readLine();
			hayasa=Double.parseDouble(str);
			byou=hayasa/9.8;
			takasa=4.9*byou*byou;
			for(int i=1; i>0; i++) {
				if(takai==false && takasa+5>i*5) {
					kai=i;
					break;
				}
			}
			System.out.println(kai);
		}catch(IOException e) {

		}

	}
}
