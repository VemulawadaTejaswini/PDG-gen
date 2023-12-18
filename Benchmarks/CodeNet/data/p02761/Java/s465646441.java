import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    String s[] = new String[3];
    s[0] = "1";
    s[1] = "0";
    s[2] = "0";
    int count[] = new int[3];
    count[0] = 0;
    count[1] = 0;
    count[2] = 0;
    String ss[] = new String[3];
    ss[0] = "";
    ss[1] = "";
    ss[2] = "";
    for(int i = 0;i<m;i++){
      int si = sc.nextInt();
      String ci = sc.next();
      if(si == 1){
        if(ci.equals("0")){
          System.out.println(-1);
          return;
        }
        count[0]++;
        ss[0] = ss[0] + ci;
      }else if(si == 2){
        count[1]++;
        ss[1] = ss[1] + ci;
      }else if(si == 3){
        count[2]++;
        ss[2] = ss[2] + ci;
      }
    }
    for(int i = 0;i<3;i++){
      if(count[i] == 0){
        continue;
      }else if(count[i] == 1){
        s[i] = ss[i];
      }else{
        String kiri = ss[i].substring(0,1);
        ss[i] = ss[i].replace(kiri,"");
        if(ss[i].length() == 0){
          s[i] = kiri;
        }else{
          System.out.println(-1);
          return;
        }
      }
    }
    for(int i = 0;i<n;i++){
      System.out.print(s[i]);
    }
  }
}
