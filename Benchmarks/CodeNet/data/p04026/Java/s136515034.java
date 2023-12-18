import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String moji = sc.next();

		 String val[] = new String[26];
		 val[0] = "a";
		 val[1] = "b";
		 val[2] = "c";
		 val[3] = "d";
		 val[4] = "e";
		 val[5] = "f";
		 val[6] = "g";
		 val[7] = "h";
		 val[8] = "i";
		 val[9] = "j";
		 val[10] = "k";
		 val[11] = "l";
		 val[12] = "m";
		 val[13] = "n";
		 val[14] = "o";
		 val[15] = "p";
		 val[16] = "q";
		 val[17] = "r";
		 val[18] = "s";
		 val[19] = "t";
		 val[20] = "u";
		 val[21] = "v";
		 val[22] = "w";
		 val[23] = "x";
		 val[24] = "y";
		 val[25] = "z";

		 String patan = null;
		 boolean flg = true;
		 for (int i =0; i < 26;i ++){
				Pattern p = Pattern.compile(val[i]);
				Matcher m = p.matcher(moji);
				int count =0;
				while(m.find()){
					count++;
				}
				if ((count *2 ) >= moji.length() ){

					if (flg) {
						flg = false;
						patan = val[i];
					}else {
						patan = null;
						break;
					}
				}
		 }

		 if ( patan == null || patan.length() == 0 ){
			 System.out.println("-1 -1");
		}else{

			 System.out.println((moji.indexOf(patan)+1) + " " + (moji.lastIndexOf(patan)+1));

		}
		sc.close();
	}

}
