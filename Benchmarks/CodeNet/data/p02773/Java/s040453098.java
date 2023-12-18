import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s[] = new String[n];
    for(int i = 0;i<n;i++){
      s[i] = sc.next();
    }
    int kp[] = new int[n];
    for(int i = 0;i<n;i++){
      if(s[i].equals("0")){
        continue;
      }else{
        for(int j = i+1;j<n;j++){
          if(s[i].equals(s[j])){
            kp[i]++;
            s[j] ="0";
          }
        }
      }
    }

    int kpmax = 0;
    for(int i = 0;i<n;i++){
      if(kpmax < kp[i]){
        kpmax = kp[i];
      }
    }

    ArrayList<String> li = new ArrayList<String>();
    for(int i = 0;i<n;i++){
      if(kp[i] == kpmax){
        li.add(s[i]);
      }
    }

    Collections.sort(li);
    for(int i = 0;i<li.size();i++){
      System.out.println(li.get(i));
    }

  }
}
