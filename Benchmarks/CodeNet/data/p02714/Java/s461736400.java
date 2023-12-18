import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),r=0,b=0,g=0,f=0;
    String[] s=sc.next().split("");
    for(int i=0;i<n-3;i++){
      if(s[i].equals("R")){
        r++;
      }else if(s[i].equals("B")){
        b++;
      }else{g++;}
      f=r*b*g;
    }
    for(int i=0;i<n-2;i++){
      for(int j=0;j<n-1;j++){
        if(s[i].equals(s[j])==false&&s[j].equals(s[2*j-i])==false&&s[2*j-i].equals(s[i])==false){
          f--;
        }
      }
    }
    System.out.print(f);
  }
}
