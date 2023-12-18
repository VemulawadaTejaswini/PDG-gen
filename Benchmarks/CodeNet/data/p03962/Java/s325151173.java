import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in); 
    ArrayList<Integer> listA = new ArrayList<Integer>();
    
    while(scanner.hasNextLine()){
      int n = scanner.nextInt();
      listA.add(n);
    }
    ArrayList<Integer> listB = new ArrayList<Integer>(new HashSet<>(listA));
    System.out.println(listB.size());
  }
}