import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String wk = sc.next();
    String[] ballArray = wk.split("");
    int ballNum = 0;
    for (int i = 0;i < ballArray.length;i++){
      if (ballArray[i].equals("1")) {
        ballNum = ballNum + 1;
      }
    }
	System.out.println(ballNum);
  }
}