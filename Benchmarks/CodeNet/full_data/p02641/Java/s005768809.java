import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<String>();
      int N , X;
      int i = 0; 
      while (scan.hasNextLine()) {
      String an = scan.nextLine();
      list.add(an);
      }
      String List[] = list.get(0).split(" ",0);
      X = Integer.parseInt(List[0]);
      N = Integer.parseInt(List[1]);
  //    System.out.println(N);
      int num[] = new int[N];
      if(N != 0){
      String Atai[] = list.get(1).split(" ",0);
      while(i < N){
        num[i] = Integer.parseInt(Atai[i]);
        i++;
      }
              
      Arrays.sort(num);
      check(num,X,N);
      }else{
       System.out.println(X);
        }

        scan.close();
    }
  
  public static void check(int[] num,int x,int n){
   //System.out.println(num[0]);
    List<Integer> numList = new ArrayList<Integer>(num.length);
    for (int i = 0; i < num.length; i++) {
       numList.add(num[i]);
    }
    int s,l;
     s = x;
     l = x;
    while(true) {
      if(numList.contains(s)){
        s = s-1;
        if(numList.contains(l)){
          l = l + 1;
         }else{
          System.out.println(l);
          break;
        }
        }else{
       System.out.println(s);
//       System.out.println("ok");
       break;
      }
     
      }
    }
}