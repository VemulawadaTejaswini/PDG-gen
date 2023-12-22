import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> n = new ArrayList<Integer>();
    for (int i = 0; i < 3; i++){
    int data = scanner.nextInt();
    n.add(data);
    }
    Collections.sort(n);

    for(int i = 0; i < 3; i++){
        System.out.print(n.get(i) + " ");
  }
}
}