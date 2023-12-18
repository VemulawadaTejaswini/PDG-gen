import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    int[][] array = new int[q][2];
    int count;
    for(int i=0; i<q; i++){
      for(int j=0; j<2; j++){
        array[i][j] = sc.nextInt();
      }
    }
    for(int k=0; k<q; k++){
      int x = array[k][0];
      int y = array[k][1];
      String words = s.substring(x-1, y-1);
      count = 0;
      for(int l=0; l<y-x; l++){
        String words2 = words.substring(l, l+1);
        if(words2.equals("AC")){
          count++;
        }
      }
      System.out.println(count);
    }
  }
}
