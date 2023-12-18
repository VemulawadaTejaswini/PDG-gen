import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long h = sc.nextLong();
      long w = sc.nextLong();
      long ans =0;
      if(ans==0 || ans%2==1){
        ans++;
      }else{
        ans=(h*w+1)/2;
      }
      System.out.println(ans);
    }
}