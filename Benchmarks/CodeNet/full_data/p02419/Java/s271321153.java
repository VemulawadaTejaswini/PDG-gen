import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String w = scan.next();
		String ws[] = w.split("");
		String t = new String();
		while(scan.hasNext()){
			String buf = scan.next();
			t = t + buf;
		}
		String ts[] = t.split("");
		int i,m,a,b,cou,e,ti;
		b = 0;
		a = 0;
		ti = 0;
		for(m = a; m < t.length() - w.length(); m++){
			cou = 0;
		for(i = 0; i < w.length(); i++){
			for(e = a; e < w.length(); e++){
			if(ts[e].equals(ws[i]))
				cou++;
		}
			if(cou == w.length())
				ti++;
		a++;
	}
		System.out.println(ti);
		
}}}

	
		


	