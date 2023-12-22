import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) 
	throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		ArrayList<String> al = TempReaderCall.getStdInReadlines(br, "0");
		
		for (int i=0; i < al.size(); i++){
			System.out.println(sumFromString(al.get(i)));
		}
	}
	
	static int sumFromString(String data){
		int sum = 0;
		for(int i=0; i<data.length(); i++){
			sum += Integer.parseInt(data.substring(i, i+1));
		}
		
		return sum;			
	}

}
class TempReaderCall{
	
	static ArrayList<String> getStdInReadlines(BufferedReader br, int line) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < line; i++)
			list.add(br.readLine());
		return list;
	}
	
	static ArrayList<String> getStdInReadlines(BufferedReader br, String end) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		String newdata;
		do{
			newdata =br.readLine();
			if (end.compareTo(newdata)==0)
				break;
			list.add(newdata);
		}while(newdata!=null);
		
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