import java.io.*;

class Watch {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String secStr = br.readLine();
		int sec = Integer.parseInt(secStr);
		int[] hms = new int[3];
//		for( int i = 0; i < 3 ; i++ ) {
//			hms[i] = sec % 60;
//			sec = sec / 60;
//		}
		hms[2] = sec/3600;
		sec %= 3600;
		hms[1] = sec/60;
		sec %= 60;
		hms[0] = sec;
		System.out.print( hms[2] + ":" + hms[1] + ":" + hms[0] ) ;
	}
}