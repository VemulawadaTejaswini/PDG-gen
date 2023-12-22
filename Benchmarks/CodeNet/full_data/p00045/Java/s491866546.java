import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		List<Integer> listSum = new ArrayList<Integer>();
		List<Integer> listAve = new ArrayList<Integer>();
		List<Integer> listTotal = new ArrayList<Integer>();

		int cnt = 0;
		int total = 0;
		double ave = 0;

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str;
		while((str=br.readLine())!=null){
			String[] sp = str.split(",");

			listSum.add(Integer.parseInt(sp[0]));
			listAve.add(Integer.parseInt(sp[1]));
			listTotal.add(listSum.get(cnt) * listAve.get(cnt));
			cnt++;

			//if(cnt == 3)
				//break;
		}

		for(int i = 0; i < cnt; i++){
			total += listTotal.get(i);
			ave += listAve.get(i);
		}

		System.out.println(total);
		System.out.println(Math.round(ave / cnt));

	}

}