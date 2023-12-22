import java.util.*;



public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int a[] = new int[n];
    for(int i =0; i<n; i++){
      a[i] = scanner.nextInt();
    }

    int ans  =0;
    for(int i = 0; i < n; i++){
      if(i % 2 ==1 && a[i] % 2 == 1){
        ans++;
      }
    }
    


    System.out.println(ans);
    
    scanner.close();
    return;
  }
  
}
