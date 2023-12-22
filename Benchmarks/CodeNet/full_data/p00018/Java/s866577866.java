import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Integer> values = new ArrayList<Integer>();
		String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
		String outString = "";
        String[] sarr = s.split(" ");
        int len = sarr.length;
        
        for(int i =0; i < len; i++){
            values.add(Integer.valueOf(sarr[i]));
        }

		Collections.sort(values);
		
		System.out.println(String.join(" ",values));
		
	}

}