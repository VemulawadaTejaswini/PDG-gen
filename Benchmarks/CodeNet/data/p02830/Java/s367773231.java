import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
  
  public static void main(String[] args){
	  
	  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	  
	  try {
		  int stringLength = Integer.parseInt(bufferedReader.readLine());
		  String s = bufferedReader.readLine();
		  String t = bufferedReader.readLine();
		  List<String> sList = Arrays.asList(s.split(""));
		  List<String> tList = Arrays.asList(t.split(""));
		  List<String> anString = new ArrayList<>();
		  for (int i = 0; i < stringLength; i++) {
			anString.add(sList.get(i));
			anString.add(tList.get(i));
		}
		  String ans = String.join("", anString);
		  System.out.println(ans);
		  

	} catch (IOException e) {
		System.out.println(e.getCause());
	}

  }
}