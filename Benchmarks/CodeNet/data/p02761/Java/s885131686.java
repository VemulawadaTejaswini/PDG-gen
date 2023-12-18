import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // get value from StandardIn
    int keta = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int ans = 0;
    int jouken[] = new int[keta];
    int check[] = new int[keta];

    for(int i=0;i<m;i++){
      int tmpKeta = Integer.parseInt(sc.next());
      int tmpNum = Integer.parseInt(sc.next());
      if(tmpKeta == 1 && tmpNum == 0){
        System.out.println("-1");
        System.exit(0);
      }else if(check[tmpKeta - 1] == 0){
        jouken[tmpKeta - 1] = tmpNum;
        check[tmpKeta - 1] = 1;
      }else if(check[tmpKeta - 1] == 1 && jouken[tmpKeta - 1] == tmpNum){
        continue;
      }else{
        System.out.println("-1");
        System.exit(0);
      }
    }
    for(int i=0; i<keta; i++){
      ans += Math.pow(10, keta-1-i) * jouken[i];
    }
    System.out.println(ans);
  }
}
