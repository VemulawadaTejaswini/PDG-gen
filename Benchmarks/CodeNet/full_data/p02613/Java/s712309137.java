import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class Main {
    public static void main(String[] args) {
      // AC,TLE,WA,RE
        Scanner scan = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<String>();
      int N;
      int i = 0; 
      while (scan.hasNextLine()) {
      String an = scan.nextLine();
      list.add(an);
      }
      String List[] = list.get(0).split(" ",0);
      N = Integer.parseInt(List[0]);
  //    System.out.println(N);
      String ce[] = new String[N];
      while(i < N){
        ce[i] = list.get(i + 1);
        i++;
      }
 //     System.out.println(ce[5]);
      check(ce,N);
   
      scan.close();
    }
  
  public static void check(String[] ce,int n){
    // AC,TLE,WA,RE
    int countA = 0, countT = 0, countW = 0, countR = 0;
   // System.out.println(n);
    int i = 0;
    while(i < n){
  //    System.out.println("ok");
      if(ce[i].equals("AC")){
        countA = countA + 1;
      }else if(ce[i].equals("TLE")){
        countT = countT + 1;
      }else if(ce[i].equals("WA")){
        countW = countW + 1;
      }else if(ce[i].equals("RE")){
        countR = countR + 1;
      }
      i++;
    }
    System.out.println("AC x "+countA);
    System.out.println("WA x "+countW);
    System.out.println("TLE x "+countT);
    System.out.println("RE x "+countR);
    return;
      }
}
    