import java.util.*;
public class Main{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      Map<int, int>map = new HashMap<>();
      List<int[]> intList = new ArrayList<>();
      for(int i=0; i<n; i++){
        int ki = sc.nextInt();
        int[] array = new int[ki];
        	for(int j=0; j<ki; j++){
              array[j] = sc.nextInt();
            }
        intList.add(array);
      }
      for(i=1; i<=m; i++){
        map.put(i, o);
      }
      for(int[] array: intList){
        for(int i: array){
          int j = map.get(i) + 1;
          map.put(i, j);
        }
      }
    int count = 0;
      for(int i=1; i<=m; i++){
        if(map.get(i) == n){
          count++;
        }
      }
      System.out.println(count);
  }
}