import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    String str = sc.nextLine();
    Judge try1 = new Judge(A,C,str);
    Judge try2 = new Judge(B,D,str);
    System.out.println("YES");
  }
}
class Judge{
  int start;
  int end;
  String str2;
  public Judge(int start,int end,String str2){
    for(int i = start; i <= end; i++){
      if(i==end){
        break;
      }
      if(str2.charAt(i+2)=='.'){
        i=i+2;
      }else{
        if(str2.charAt(i+1)=='.'){
          i++;
        }else{
          System.out.println("NO");
          break;
        }
      }
    }
  }
}
