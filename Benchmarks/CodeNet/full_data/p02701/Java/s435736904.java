import java.util.*;
import java.io.*;
public class Main{
  public static void main(String [] args) throws IOException{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int n=Integer.parseInt(br.readLine().trim());
	  Map<String,Integer> map=new HashMap<>();
	  while(n-->0){
		  map.put(br.readLine().trim(),1);
	  }
	  System.out.println(map.size());
  }

}