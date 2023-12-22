import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	int DATAKIND = 26;
	int[] count;
	public static void main(String[] args) 
	throws IOException{
		// TODO Auto-generated method stub
		new Main().run();
	}
	
	public Main(){
		count = new int[DATAKIND];
		for (int i=0; i<count.length; i++)
			count[i] = 0;
		
	}

	void run () 
		throws IOException{
		StandardIn buf = new StandardIn();
		
		ArrayList<String> al = buf.getlines(0);
		for(int i=0; i<al.size(); i++)
			countData(al.get(i).toCharArray());
		
		
		printResult(count);
	}
	
	private void printResult(int[] count){
		for(int i=0; i<count.length; i++)
			System.out.println(gethashkey(i)+" : "+count[i]);
	}
	private int[] countData(char[] data){

		for (int i=0; i<data.length; i++)
			if(Character.isAlphabetic(data[i]))
				count[hashdata(Character.toLowerCase(data[i]))] ++;
		
		return count;
	}
	
	private int hashdata(char data){
		return (int)(data-'a');
	}
	
	private String gethashkey(int data){
		return Character.toString((char)(data+'a'));
	}
}

class TempReaderCall{
	/*
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
	*/
	
	static int[] splitIntArrayFromString(String st) {
		String[] sts = st.split(" ");
		int[] data = new int[sts.length];
		
		for (int i=0;i<sts.length;i++){
			data[i] = Integer.parseInt(sts[i]);
		}
		
		return data;
	}
}

class StandardIn{
	private BufferedReader br;
	
	StandardIn(){
		br = new BufferedReader (new InputStreamReader(System.in));
	}
	
	ArrayList<String> getlines(int line) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		if (line==0){
			String tmplinedata;
			while(null != (tmplinedata = br.readLine())){
				list.add(tmplinedata);
			}
		}
		else {
			for (int i = 0; i < line; i++)
				list.add(br.readLine());
		}
		return list;
	}
	
	ArrayList<String> getlines(String end) throws IOException {
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
	
	String getaline() throws IOException {
		return (br.readLine());
	}
}