import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] N = new int[30];
    String h = null;

    int l = 0;
    while(sc.hasNextLine()){
      h = sc.nextLine();
      String[] hl = h.split(" ");
      for(String i:hl){
        N[Integer.parseInt(i)] += 1;
        l++;
      }

    }
    List<Integer> X = new ArrayList();
    for(int i=0;i<30;i++)if(N[i]==l)X.add(i);
    for(int j:X)System.out.print(j);
  }
}
