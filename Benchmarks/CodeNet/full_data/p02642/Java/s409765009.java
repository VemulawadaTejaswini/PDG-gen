import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];
    for(int i=0; i<n; i++){
      array[i] = sc.nextInt();
    }

    Arrays.sort(array);
    int count = 0; //条件を満たさない整数の個数

    for(int i=0; i<n; i++){
      if((i<n-1) && array[i]==array[i+1]){
        count++;
        continue;
      }
      if(i>0 && array[i]==array[i-1]){
        count++;
        continue;
      }
      for(int j=0;j<i;j++){
        if(array[i] % array[j]==0){
          count++;
          break;

        }
        //System.out.println(i+":"+j);
      }
      //System.out.println("**");
    }

    System.out.println(array.length-count);
  }

}