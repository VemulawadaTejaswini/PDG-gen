import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();

    ArrayList<Integer> a = new ArrayList<Integer>(n);

    for (int i=0 ; i<n ; i++){
      a.add(sc.nextInt());
    }

    for (int i=1 ; i<n+1 ; i++){
        System.out.print(a.indexOf(i)+1+" ");      
    }
  }
}