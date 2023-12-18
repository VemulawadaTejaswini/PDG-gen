import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int[] time = new int[5];
    int min = 10;
    int n = 0;
    for(int i = 0;i < 5;i ++){
      time[i] = Integer.parseInt(scan.nextLine());
      if((time[i] - 1) % 10 < min){
        min = (time[i] - 1) % 10;
        n = i;
      }
    }
    int sum = 0;
    for(int i = 0;i < 5;i ++){
      if(i != n){
        if(time[i] % 10 == 0){
          sum += time[i];
        }else{
          sum += (time[i] / 10 + 1) * 10;
        }
      }
    }
    System.out.println(sum + time[n]);
  }
}
