import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main{
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data = br.readLine().split(" ");
    
    Set<Integer> integerSet = new HashSet<>();
    
    for(int i=0; i<3; i++){
      integerSet.add(Integer.parseInt(data[i]));
    }
    
    if(integerSet.size() == 2){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}