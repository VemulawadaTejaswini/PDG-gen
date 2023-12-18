import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
      	Set<Integer> s = new HashSet<Integer>();      	
      
      	for (int i=0; i<k; i++){
          int d = sc.nextInt();
          for(int j=0; j<d; j++){
            int a = sc.nextInt();
            s.add(a);
          }
        }
      
      int r = n - s.size();
            System.out.println(r);
    }
}