import java.util.*;
 
class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      List<Integer> list = new ArrayList<Integer>();
      List<String> listAns = new ArrayList<String>();
      for(int i=1; i<=N; i++){
        int Ai = sc.nextInt();
        list = list.add(Ai);
      }
      int count = 0;
      for(int k=1; k<=N; k++){
        for(int j=0; j<N; j++){
         if(list.get(j) == k){
           count++;
         }
        }
        System.out.println(count); 
      }
    }
}