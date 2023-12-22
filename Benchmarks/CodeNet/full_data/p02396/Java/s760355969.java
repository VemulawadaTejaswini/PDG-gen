import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> al = new ArrayList<Integer>();
    int n,k;
    while ((n = sc.nextInt()) != 0){
      al.add(n);
    }
    k = 0;
    for(Integer i :al){
      k++;
      System.out.println("Case" + k + ": " + i);
    }
  }
}

