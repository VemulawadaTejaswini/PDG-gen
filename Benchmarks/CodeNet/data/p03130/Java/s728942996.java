import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int michi[] = new int[6];
    for(int i = 0 ; i < 6 ; ++i){
      michi[i] = sc.nextInt();
    }
    int kazu[] = new int[4];
    for(int i = 0 ; i < 4 ; ++i){
      kazu[i] = 0;
    }
    for(int i = 0 ; i < 6 ; ++i){
      if(michi[i] == 1){
        kazu[0]++;
      }else if(michi[i] == 2){
        kazu[1]++;
      }else if(michi[i] == 3){
        kazu[2]++;
      }else if(michi[i] == 4){
        kazu[3]++;
      }
    }
    
    String ans = "YES";
    
    for(int i = 0 ; i < 4 ; ++i){
      if(kazu[i] >= 3){
        ans = "NO";
      }
    }

    System.out.println(ans);
    
  }
}