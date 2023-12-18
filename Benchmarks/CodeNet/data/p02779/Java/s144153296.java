import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
	InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    
    String inputLen = null;
    String inputArray = null;
    try{
      inputLen = br.readLine();
      inputArray = br.readLine();
    }catch(IOException e){
      e.printStackTrace();
    }
    int len = PerseInt(inputLen);
    List<String> list = Arrays.asList(inputArray.split(" "));
    boolean result = false;
    for(int i = 0; len < i; i++){
      String target = list.get(i);
      list.set(i, null);
      if(list.indexOf(target) != -1){
        result = true;
        break;
      }
    }
    if(result){
	    System.out.println("YES");
    }else{
	    System.out.println("No");
    }
  }
}
