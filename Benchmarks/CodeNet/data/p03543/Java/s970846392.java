import java.util.Scanner;

public class Main{
  public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ryuka[] = new int[90];
        ryuka[0] = 0;
        ryuka[1] = 2;
        ryuka[2] = 1;
        for(int i = 3;i <= 86 ;i++){
          ryuka[i] = ryuka[i-1] + ryuka[i-2];
        }
        System.out.println(ryuka[n]);
  }
}