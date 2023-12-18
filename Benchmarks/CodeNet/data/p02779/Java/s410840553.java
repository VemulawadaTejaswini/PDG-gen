import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main{
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int numAll = Integer.parseInt(br.readLine());
    
    String[] numsStr = br.readLine().split(" ");
  
    Set<String> numSet = new HashSet<>();
    
    for(int i=0; i<numAll; i++){
      numSet.add(numsStr[i]);
    }
    
    if(numAll == numSet.size()){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}