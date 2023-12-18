import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] l = new int[n];
    int d = 0;
    for(int i = 0;i<n;i++){
      l[i] = sc.nextInt();
    }
    for(int i = 0;i<n-2;i++){
      for(int j = i+1;j<n-1;j++){
        for(int k = j+1;k<n;k++){
          if(l[i]<(l[k]+l[j])&&l[k]<(l[i]+l[j])&&l[j]<(l[i]+l[k])){
            d++;
          }
        }
      }
    }
    System.out.println(d);
  }
}
