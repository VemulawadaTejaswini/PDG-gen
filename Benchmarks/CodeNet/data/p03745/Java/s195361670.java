import java.util.Scanner;

public class A{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n, result;

    n = s.nextInt();
    
    result = devideArray(n);

    System.out.println(result);
   }

  public static int devideArray(int n){
    Scanner s = new Scanner(System.in);
    int[] array = new int[n];
    int count = 1;
    boolean flag = true;
    int updown = 0;

    for(int i = 0;i < n;i++){
      array[i] = s.nextInt();
    }

    for(int i = 0;i < n - 1;i++){
      if(flag){
        if(array[i] - array[i + 1] > 0){
          updown = -1;
          flag = false;
        }else if(array[i] - array[i + 1] < 0){
          updown = 1;
          flag = false;
        }
      }else{
        if(array[i] - array[i + 1] > 0){
          if(updown != -1){
            count++;
            flag = true;
          }
        }
        if(array[i] - array[i + 1] < 0){
          if(updown != 1){
            count++;
            flag = true;
          }
        }
      }
    }

    return count;
  }
}
