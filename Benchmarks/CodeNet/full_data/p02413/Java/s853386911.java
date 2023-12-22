import java.util.ArrayList;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public final class Main {

	public static void main(String[] args) 
	throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arraysize = TempReaderCall.splitIntArrayFromString(TempReaderCall.getStdInRead(br));
		
		int[] ctotal = new int[arraysize[1]];
		ArrayList<String> list = TempReaderCall.getStdInReadlines(br, arraysize[0]);
		
		for (int i=0; i<arraysize[0]; i++){
			int[] rowdata = TempReaderCall.splitIntArrayFromString(list.get(i));
			addColumnData(ctotal, rowdata);
			System.out.println(list.get(i) + " " + sum(rowdata));
		}
		
		System.out.println(printRow(ctotal) + sum(ctotal));
		
	}
	
	static int sum (int[] data){
		int total = 0;
		for(int i=0; i < data.length; i++)
			total += data[i];
		
		return total;
	}
	
	static void addColumnData(int[] ctotal, int[] rowdata){
		for(int i=0; i<ctotal.length; i++)
			ctotal[i] += rowdata[i];
	}
	
	static String printRow(int[] ctotal){
		String line = "";
		for(int i=0; i < ctotal.length; i++) 
			line = line + Integer.toString(ctotal[i]) + " ";
		return line;
	}

}


class TempReaderCall{
	
	static ArrayList<String> getStdInReadlines(BufferedReader br, int line) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < line; i++)
			list.add(br.readLine());
		return list;
	}
	
	static String getStdInRead(BufferedReader br) throws IOException {
		return (br.readLine());
	}
	
	
	static int[] splitIntArrayFromString(String st) {
		String[] sts = st.split(" ");
		int[] data = new int[sts.length];
		
		for (int i=0;i<sts.length;i++){
			data[i] = Integer.parseInt(sts[i]);
		}
		
		return data;
	}
}