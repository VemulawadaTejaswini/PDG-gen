import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long h = sc.nextInt();
      long w = sc.nextInt();
      long ans =0;
      if(h*w==1){
        ans++;
      }else{
        ans=(h*w+1)/2;
      }
      System.out.println(ans);
    }
}