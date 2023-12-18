import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    ArrayList<Integer> B = new ArrayList<>();
    
    for(int i = 0; i < n; i++){
     a[i] = sc.nextInt();
    }

    for(int i = 0; i < n; i++){
      B.add(a[i]);
      Collections.reverse(B);
    }
    
    for(int i = 0; i < n; i++){
       System.out.print(B.get(i) + " ");
     }
    
     System.out.println();
  }  
}