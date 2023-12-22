import java.util.ArrayList;
import java.util.Collections;

class Main{
  public static void main(String[] args){
    ArrayList<Integer> mountain = new ArrayList<Integer>();
    int count = 10;
    while(count>0){
      mountain.add(new java.util.Scanner(System.in).nextInt());
      count--;
    }

    Collections.sort(mountain);
    System.out.println(mountain.get(9));
    System.out.println(mountain.get(8));
    System.out.println(mountain.get(7));

  }
}