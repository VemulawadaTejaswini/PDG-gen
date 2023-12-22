import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Double  N=sc.nextDouble();
    String str = String.valueOf(N);
    String []hairetu = str.split("");
    Double sum=0.0;
    for (int i=0;i<hairetu.length ;i++ ) {
      if(hairetu[i].equals(".")){
        break;
      }
      if(hairetu[i].equals("E")){
       break;
      }
      sum=sum+Double.parseDouble(hairetu[i]);
    }
    if(sum%9==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
}
}
