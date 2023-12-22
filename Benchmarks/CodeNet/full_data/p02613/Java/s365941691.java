import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int ac = 0;
    int wa = 0;
    int tle = 0;
    int re = 0;
    for(int i = 1;i <= N;i++){
      String result = sc.nextLine();
      switch(result){
        case "AC":
          ac++;
          break;
        case "WA":
          wa++;
          break;
        case "TLE":
          tle++;
          break;
        case "RE":
          re++;
          break;
      }
    }
  System.out.println("AC x "+ac+"\n"+"WA x "+wa+"\n"+"TLE x "+tle+"\n"+"RE x "+re);
  }
}