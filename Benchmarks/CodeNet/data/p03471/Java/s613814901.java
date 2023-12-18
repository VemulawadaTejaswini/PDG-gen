import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int y = scan.nextInt();

      int bill10000=-1;
      int bill5000=-1;
      int bill1000=-1;
      for(int i=0;i<=n;i++){
        for(int j=0;j+i<=n;j++){
          int k = n-i-j;
          if(i*10000+j*5000+k*1000==y){
          bill10000=i;
          bill5000=j;
          bill1000=k;
          }
          }
        }

        System.out.println(bill10000+" "+bill5000+" "+bill1000);
      }
    }
