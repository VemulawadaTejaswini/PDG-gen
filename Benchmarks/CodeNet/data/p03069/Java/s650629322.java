import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=Integer.parseInt(sc.nextLine());
    String s=sc.nextLine();
    char[] c=s.toCharArray();
    int counts=0;
    for(int i=0;i<n;i++){
      if(c[i]=='#'){
        for(int j=i;j<n;j++){
          if(c[j]=='.'){
            counts++;
          }
        }
        break;
      }
    }
    System.out.print(counts);
  }
}