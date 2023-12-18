import java.util.*;

public class Main{
  public static void main(String[] args){
    
    String S = new Scanner(System.in).nextLine();
    
    String[]  S_Array = new String[S.length()];
    
    for(int i=0; i<S.length(); i++){
        S_Array[i] = String.valueOf(S.charAt(i));
    }

    
    if(S_Array[2].equals(S_Array[3]) && S_Array[4].equals(S_Array[5])){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}

    
    