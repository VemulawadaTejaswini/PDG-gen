import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int array[] = new int[num];
    for(int i = 0;i < num;i++){
      array[i] = sc.nextInt();
    }
    int count = 0;
    for(int i = 0;i < num;i++){
      boolean flag = true;
      for(int j = 0;j <= i;j++){
        if(array[j] <= array[i]){
          flag = false;
        }
      }
      if(flag){
        count++;
      }
    }
    System.out.println(count);
  }
}