import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		ArrayList<String> arr=new ArrayList<String>();
		while((str=br.readLine())!=null){
			if(!str.equals("0")){
				arr.add(str);
				/*System.out.println(arr.size());*/
			}
			else{
				System.out.println(arr.get(arr.size()-1));
				arr.remove(arr.size()-1);
			}
		}
	}

}