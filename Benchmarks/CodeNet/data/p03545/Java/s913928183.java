import java.util.*;

public class Main{
  public static void main(String[] args){
    StringBuilder sb = new StringBuilder();
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int[] digit = new int[4];

    for(int i = 3; i >= 0; i--){
      digit[i] = s.charAt(i) - '0';
    }

    outline:for(int j = 0; j < (int)Math.pow(2, 3); j++){
      sb.append(digit[3]);
      int sum = digit[3];
      for(int k = 2; k >= 0; k--){
        if((1 & (j >> k)) == 1){
          sb.append('-');
          sb.append(digit[k]);
          sum -= digit[k];
        }else{
          sb.append('+');
          sb.append(digit[k]);
          sum += digit[k];
        }
      }
      if(sum == 7){
        System.out.println(sb + "=7");
        break outline;
      }
      sb.setLength(0);
    }
  }
}