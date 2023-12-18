import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    int count=0;
    for(int i=0;i<3;i++){
      for(int j=i+1;j<4;j++){
        if(s.charAt(i)==s.charAt(j)){
          count++;
        }
      }
    }
    if(count==2){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
  }
}
