import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] str_ar = line.split(" ");
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<str_ar.length;i++) {
	        list.add(Integer.valueOf(str_ar[i]));
        }
        Collections.sort(list);
        for(int i=0;i < list.size();i++) {
        	System.out.print(list.get(i));
                if(i==list.size()-1)
                            	System.out.println("");
                else
                        	System.out.print(" ");

        }
    }
}