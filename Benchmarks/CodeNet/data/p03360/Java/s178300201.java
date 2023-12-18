import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    List <Integer> list = new ArrayList<>(Arrays.asList(sc.nextInt(),sc.nextInt(),sc.nextInt()));
    Collections.sort(list);
    System.out.println((int)(list.get(0) + list.get(1) + list.get(2) * Math.pow(2, sc.nextInt())));
  }
}