import java.util.Scanner;
  public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String n = Integer.toString(N);
        int sum = 0;
        for(int i=0; i<n.length(); i++){
          int S = N / (10*i);
          String s = Integer.toString(S);
          s = s.substring(s.length() - 1);
          int t = new Integer(s).intValue();
          if (t>0){
            sum += t;
          } else {
            continue;
          }
        }
      
      if(sum%9 == 0){
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }