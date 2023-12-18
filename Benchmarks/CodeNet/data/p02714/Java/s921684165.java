import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),r=0,b=0,g=0;
    String[] s=sc.next().split("");
    for(int i=0;i<n;i++){
      if(s[i].equals("R")){
        r++;
      }else if(s[i].equals("B")){
        b++;
      }else{
        g++;
      }
    }
    int f=r*g*b;
    for(int i=0;i<n-2;i++){
      for(int j=i+1;2*j-i<n;j++){
        if(s[i]!=s[j]&&s[j]!=s[2*j-i]&&s[2*j-i]!=s[i]){
          f-=1;
        }
      }
    }
    System.out.println(f);
  }
}
