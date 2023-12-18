import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int D = N % 10;
    N /= 10;
    int C = N % 10;
    N /= 10;
    int B = N % 10;
    N /= 10;
    int A = N % 10;
    
    String ans = "";
    if(A+B+C+D == 7){
      ans = A+"+"+B+"+"+C+"+"+D+"=7";
    }else if(A+B+C-D==7){
      ans = A+"+"+B+"+"+C+"-"+D+"=7";
    }else if(A+B-C+D==7){
      ans = A+"+"+B+"-"+C+"+"+D+"=7";
    }else if(A-B+C+D==7){
      ans = A+"-"+B+"+"+C+"+"+D+"=7";
    }else if(A+B-C-D==7){
      ans = A+"+"+B+"-"+C+"-"+D+"=7";
    }else if(A-B+C-D==7){
      ans = A+"-"+B+"+"+C+"-"+D+"=7";
    }else if(A-B-C+D==7){
      ans = A+"-"+B+"-"+C+"+"+D+"=7";
    }else if(A-B-C-D==7){
      ans = A+"-"+B+"-"+C+"-"+D+"=7";
    }
    System.out.println(ans);
  }
}