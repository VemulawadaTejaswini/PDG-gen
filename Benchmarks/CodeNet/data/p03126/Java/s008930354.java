import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] N = new int[30];
    Arrays.fill(N, 1);
    int l = 0;
    while(sc.hasNextLine()){
    String h = sc.nextLine();
    String[] hl = h.split(" ");
      for(String i:hl){
          N[Integer.parseInt(i)] += 1;
        l++;
      }
    }
    for(int i=0;i<30;i++)if(N[i]-1==l)System.out.print(N[i]);
  }
}
