import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    List<Integer> a = new ArrayList<Integer>();
    
    for(int i=0;i<n;i++){
      if(n % 2 == 0){
        if(i % 2 == 0){
         a.add(0,sc.nextInt()); 
        }else{
          a.add(sc.nextInt()); 
        }
      }else{
        if(i % 2 != 0){
          a.add(0,sc.nextInt()); 
        }else{
          a.add(sc.nextInt()); 
        }
      }

    }
    System.out.println(String.join(a));
  }
}