import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      //取得
	  int N = sc.nextInt();
      String[] test = new String[N];
      int ac=0;
      int wa=0;
      int tle=0;
      int re=0;
      for(int i=0;i<N;i++){
        test[i] = sc.next();
        if(test[i].equals("AC")){
          ac++;
        }else if(test[i].equals("WA")){
          wa++;
        }else if(test[i].equals("TLE")){
          tle++;
        }else{
          re++;
        }
      }
      System.out.println("AC x "+ac);
      System.out.println("WA x "+wa);
      System.out.println("TLE x "+tle);
      System.out.println("RE x "+re);
    }
}