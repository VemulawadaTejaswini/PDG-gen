import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[]arr = new int[5];
    int ans =0;
    for(int i=0;i<5;i++){
      arr[i]=sc.nextInt();
      if(arr[i]==0){
        ans=i+1;
      }
    }
    System.out.println(ans);
    System.out.flush();
    sc.close();
  }
}
