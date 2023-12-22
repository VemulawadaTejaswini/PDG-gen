import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int n = sc.nextInt();
      long kai=1;
      int tencount=0;
      for(int i=0;i<n;i++){
        int kk=sc.nextInt();
        if(kk==0){
          kai=0;
          break;
        }else{
          if(kai>1000000000000000000l){
            kai=-1;
            break;
          }
          kai*=kk;
        }
      }
      System.out.println(kai);
    }
}