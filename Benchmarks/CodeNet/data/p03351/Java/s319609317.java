import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Main
{
    public static void main(String[] args) throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String s = br.readLine();

	String K = br.readLine();

	System.out.println(make_ArrayList(s).get(Integer.parseInt(K)-1));
    }

    public static ArrayList<String> make_ArrayList(String str){
	ArrayList<String> list = new ArrayList<String>();
	
	for(int i=0; i<str.length(); i++){
	    for(int j=i+1; j<str.length(); j++){
		list.add(str.substring(i,j));
	    }
	}

	ArrayList<String> final_list = new ArrayList<String>(new HashSet<>(list));
	
	Collections.sort(final_list);

	//System.out.println("final_list = " + final_list);

	return final_list;
    }
}