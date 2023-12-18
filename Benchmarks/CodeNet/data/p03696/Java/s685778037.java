import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    char[] s = sc.next().toCharArray();
    StringBuilder sb = new StringBuilder();
    int count = 0;
    for(int i=0;i<n;i++){
      if(s[i]=='('){
        sb.append('(');
        count++;
      }else if(count > 0){
        count--;
        sb.append(')');
      }else{
        sb.insert(0,'(');
        sb.append(')');
      }
    }
    for(int i=0;i<count;i++){
      sb.append(')');
    }
    System.out.println(sb.toString());
  }
}