import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int Sum=0;
    boolean judge=true;
    String Ss[]=new String[N];
    for (int i=0;i<N ;i++ ) {
      Ss[i]=sc.next();
    }
    for (int i=0;i<N ;i++ ) {
      for (int j=0;j<i ;j++ ) {
        if(Ss[i].equals(Ss[j])){
          judge=false;
          break;
        }
      }
      if(judge==false){
        continue;
      }
      Sum++;
    }


    System.out.println(Sum);




  }
}
