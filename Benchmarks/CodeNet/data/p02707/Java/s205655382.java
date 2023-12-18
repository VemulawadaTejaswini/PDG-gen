import java.util.Scanner;
public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  
  int n = scan.nextInt();
  int sup[] = new int[n];
  int ans[] = new int[n];
  for(int i = 0; i<n; i++){ //初期化
    sup[i] = scan.nextInt();
    ans[i] = 0;
  }
  for(int i = 0; i< n; i++){
    ans[sup[i]]++;
  }
  for(int i = 0; i< n; i++){
    System.out.println(ans[i]);
  }
}
