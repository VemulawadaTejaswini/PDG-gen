import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String Sk[] = S.split("");
    int N = S.length();
	
    String A = Sk[0];
    String B;

    int cnt = 1; //分割された文字列数
    int i=1;	 //元の文字列の添え字
    while(i < N-1){
      B = Sk[i];
      for(;;){
        if(A.equals(B)){
          i++;
          B = B + Sk[i];
        }else
          break;
      }
      A = B;
      cnt++;
      i++;
    }

    if(N != 1){
      if((A.length() == 1) && !(A.equals(Sk[N])))
        cnt++;

    }

    System.out.println(cnt);
  }
}