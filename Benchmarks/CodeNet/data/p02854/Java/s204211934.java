import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.next());
    int[] picks = new int[num];
    int total = 0;
    for(int i = 0; i < num; i++){
      picks[i] = Integer.parseInt(sc.next());
      total += picks[i];
    }

    if(total%2 != 0)
      total += 1;

    int halftotal = 0;
    int count = -1; //超えた時の添字
    for(int i = 0; i < num; i++){
      halftotal += picks[i];
      count++;
      if(halftotal >= total/2)
        break;
    }

    int endtotal = 0;
    for(int i = count+1; i < num; i++)
      endtotal += picks[i];

    System.out.println(halftotal-endtotal);
  }
}