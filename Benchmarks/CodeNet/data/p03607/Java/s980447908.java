import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> array = new ArrayList<Integer>();
    for(int i=0;i<N;i++){
      Integer a = sc.nextInt();
      if(array.contains(a)){
        array.remove(array.indexOf(a));
      }else{
        array.add(a);
      }
    }    
     System.out.println(array.size());
  }
}