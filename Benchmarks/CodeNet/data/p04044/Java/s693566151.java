import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    String result = "";
    List<String> word = new ArrayList<String>();
    for(int i=0; i<N; i++){
      word.add(sc.next());
    }
    Collections.sort(word);
    for(String string : word){
    result += string;
    }
    System.out.println(result);
  }
}