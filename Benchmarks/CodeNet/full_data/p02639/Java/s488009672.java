import java.util.*;

public class Main {
  public static void main(String[] args){
    List<Integer> xList = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      xList.add(sc.nextInt());
    }
    Collections.sort(xList);
    System.out.println(xList.get(0));
  }
}