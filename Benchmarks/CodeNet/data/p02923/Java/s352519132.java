import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[] box = new int[a];
    int ans = 0;
    for(int i=0;i<a;i++){
      box[i] = sc.nextInt();
    }
    for(int i=0;i<a-1;i++){
      int ans2 = 0;
      for(int j=i;j<a-1;j++){
        if(box[j]>=box[j+1]){
          ans2++;
        }else{
          break;
        }
        if(ans <= ans2){
          ans = ans2;
        }
      }
    }
    System.out.println(ans);
  }
}