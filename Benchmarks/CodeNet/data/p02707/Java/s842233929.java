import java.util.*;
 
class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      List<Integer> list = new ArrayList<Integer>();
      for(int i=1; i<N; i++){
        list.add(sc.nextInt());
      }
      int count;
      for(int k=1; k<=N; k++){
        count = 0;
        for(int j=1; j<N; j++){
         if(list.get(j) == k){
           count++;
         }
        }
        System.out.println(count); 
      }
    }
}