import java.io.*;
import java.util.ArrayList;

class Main {
    public static void main (String args[]) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> num = new ArrayList<String>();
	
	for (int i=0; i<200; i++) {
	    String str = br.readLine();
	    if (str.equals("")) break;
	    else {
		String tmp[] = str.split("[\\s]+");
		num.add(String.valueOf(Integer.parseInt(tmp[0]) + Integer.parseInt(tmp[1])));
	    }
	}
	
	for (int i=0; i<num.size(); i++) {
	    System.out.println(num.get(i).length());
	}
    }
}