import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      while(true){
        int n = sc.nextInt();
        if(n==0)break;
        int [] s = new int[n];
        int max = 0;
        int min = 1000;
        int sum = 0;
        for(int i=0;i<n;i++){
          s[i] = sc.nextInt();
          if(s[i]>max)max=s[i];
          if(s[i]<min)min=s[i];
          sum += s[i];
        }
        sum = sum - min - max;
        int score = sum / (n - 2);
        System.out.println(score);
      }
    }
  }
}

