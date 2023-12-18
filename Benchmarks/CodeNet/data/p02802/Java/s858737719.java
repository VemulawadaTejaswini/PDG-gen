import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int ac_count = 0;
    int wa_count = 0;
    Integer[] ac_list = new Integer[m];
    Arrays.fill(ac_list,0);
    int p = 0;
    String s;

    for(int i=0; i<m; i++){
      p = sc.nextInt();
      s = sc.next();
      if(!(Arrays.asList(ac_list).contains(p))){
        if(s.equals("AC")){
          ac_count += 1;
          ac_list[i] = p;
        }else{
          wa_count += 1;
        }
        //System.out.println(Arrays.toString(ac_list));
      }

    }

    System.out.println(ac_count + " " + wa_count);
  }
}