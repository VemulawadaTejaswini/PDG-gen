import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String[] a = new String[n];
    boolean flag = true;
    for(int i = 0;i < n;i++){
      a[i] = scan.next();
    }
    for(int i = 0;i < n;i++){
      if(i == 0){
        continue;
      }
      if(a[i].charAt(0) != a[i-1].charAt(a[i-1].length()-1)){
        flag = false;
        break;
      }
      for(int j = 0;j < i;j++){
        if(a[i].equals(a[j])){
          flag = false;
          break;
        }
      }
      if(flag == false){
        break;
      }
    }

    if(flag){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}