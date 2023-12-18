import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int strNum = sc.nextInt();
    int quesNum = sc.nextInt();
    String str = sc.next();
    for(int i=0;i<quesNum;i++){
      int first = sc.nextInt()-1;
      int last = sc.nextInt();
      String target = str.substring(first,last);
      int count = 0;
      boolean flag=false;
      for(int j=0;j<target.length();j++){
        char c = target.charAt(j);
        if(c=='A'){
          flag=true;
        }else if(c=='C'&&flag){
          flag=false;
          count++;
        }else{
          flag=false;
        }
      }
      System.out.println(count);
    }
  }
}