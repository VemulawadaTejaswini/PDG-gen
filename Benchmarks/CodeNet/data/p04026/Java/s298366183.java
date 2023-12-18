import java.util.*;

public class Main{

  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    char[] s = sc.next().toCharArray();

    for(int i=0; i<s.length; i++){
      char s_tmp = s[i];

      int sub_length=1;
      int t_count = 1;
      int f_count = 0;
      
      for(int j=i+1; j<s.length; j++){ 
        if(s[j]==s_tmp){
          t_count++;
          sub_length++;
          if(t_count>f_count && sub_length>3){
            pl((i+1) + " " + (j+1));
            return;
          }
        }else{
          f_count++;
          sub_length++;
          if(t_count>f_count && sub_length>3){
            pl((i+1) + " " + (j+1));
            return;
          }else if(t_count<f_count){
            break;
          }
        }
      }

    }
    pl("-1 -1");

  }

  private static void pr(Object o){
    System.out.print(o);
  }
  private static void pl(Object o){
    System.out.println(o);
  }

}
