import java.util.Scanner;
import java.util.Arrays;

public class Main{
  static int judge(String a, String b){
    if(a.equals(b)){
      return 1;
    }else{
      return 0;
    }
  }


  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count = 0;


    String[] s = sc.next().split("");
    //System.out.println(StringTolist(s));
    for(int i=0; i<s.length-1;i++){
    count += judge(s[i],s[i+1]);
   }
   if(count==0){
     System.out.println("Good");
   }else{
     System.out.println("Bad");
   }

  }
}