import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int A = Integer.parseInt(S[1])-1;
    int B = Integer.parseInt(S[2])-1;
    int C = Integer.parseInt(S[3])-1;
    int D = Integer.parseInt(S[4])-1;
    
    String T = sc.nextLine();
    char[] field = new char[N];
    char tem = T.charAt(0);
    field[0] = T.charAt(0);
    for(int i = 1; i < N; i++){
      field[i] = T.charAt(i);
      if(tem == '#' && field[i] == '#'){
        System.out.println("No");
        return;
      }
      
      tem = field[i];
    }
    
    if(C < D){
      System.out.println("Yes");
      return;
    }
    
    boolean tri_check = false;
    for(int i = B; i < D-2; i++){
      if(field[i] == '.' && field[i+1] == '.' && field[i+2] == '.'){
        tri_check = true;
      }
    }
    
    boolean near_check = false;
    if(field[D-1] == '#' || field[D+1] == '#'){
      near_check = true;
    }
    
    if(near_check && !tri_check){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}