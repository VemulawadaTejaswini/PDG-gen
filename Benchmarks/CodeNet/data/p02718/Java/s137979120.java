import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int sum = 0;
    int[] array = new int[n];
    boolean flag = false;

    for(int i=0; i<n; i++){
      array[i] = sc.nextInt();
      sum += array[i];
    }

    int reg = (sum+(4*m-1))/(4*m);

    int count = 0;

    for(int i=0; i<n; i++){
      if(array[i] >= reg){
        count += 1;
        //System.out.println("number:"+i);
      }
      if(count >= m){
        flag = true;
        break;
      }

    }


    if(flag==true){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
      //System.out.println(count);

  }
}