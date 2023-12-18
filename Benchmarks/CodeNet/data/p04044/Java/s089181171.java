import java.util.*;
import java.io.*;
 
public class Main{
  
  static public void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    ArrayList<String> inputStr = new ArrayList<String>();
    String tmpStr;
    
    do{
      tmpStr = sc.next();
      inputStr.add(tmpStr);
    }while(sc.hasNext());
    
    int N = Integer.parseInt(inputStr.get(0));
    
    inputStr.remove(0);
    inputStr.remove(0);
    
    String words[] = new String[N];
    for(int i=0; i<N; i++){
      words[i] = inputStr.get(i);
    }
    
    Arrays.sort(words);
    
    for(int j=0; j<N; j++){
      System.out.printf("%s", words[j]);
    }
    
  }
}