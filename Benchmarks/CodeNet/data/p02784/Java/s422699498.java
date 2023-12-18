import java.util.Scanner;
 public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int n = scanner.nextInt();

        
      for(int i=0;i<n;i++){
        int a = scanner.nextInt();
      h = h-a;
      }
      if(h<=0){
      System.out.println("Yes");
      }
      else{
      System.out.println("No");
      }
    }
 }
 