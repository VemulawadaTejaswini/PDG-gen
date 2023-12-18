import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer l[] = new Integer[n];
    for (int i=0; i<n; i++){
      l[i] = sc.nextInt();
    }
    Arrays.sort(l, Comparator.reverseOrder());
    int count = 0;
    for (int i=0; i<n-2; n++){
      for (int j=i+1; j<n-1; j++){
        if (l[i] >= l[j]*2) break;
        else{
          for (int k=j+1; k<n; k++){
            if (l[i] < l[j]+l[k]) count ++;
            else break;
          }
        }
      }
    }
    System.out.println(count);
  }
}