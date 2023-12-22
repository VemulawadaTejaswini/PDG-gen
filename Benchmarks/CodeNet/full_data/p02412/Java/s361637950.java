import java.util.Scanner;

 public class Main{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
      int n ;
      int m ;
      boolean boo = true;
      int cnt = 0;
while(boo){
  n = sc.nextInt();
  m = sc.nextInt();
  cnt =0;
  if(n==0 && m==0) break;

  for(int i = 1;i <= n; i++){
    for(int l =1; l <= n; l++){
      if(l == i) break;
      for(int q = 1;q <= n; q++ ){
        if(q ==i || q ==l)break;
        if(i + l + q == m) cnt++;
      }

    }

  }
  System.out.println(cnt);
}
    }//main


 }//class

