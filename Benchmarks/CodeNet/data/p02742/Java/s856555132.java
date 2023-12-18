import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long h = sc.nextInt();
      long w = sc.nextInt();
      long ans;
      if(h==1 || w==1){
        ans=1;
      }else{
        ans=(h*w+1)/2;
      }
      System.out.println(ans);
    }
}