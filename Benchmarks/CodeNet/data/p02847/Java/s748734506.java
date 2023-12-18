import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        int i = 0;
        switch (s) {
          case "SUN":
            i = 7;
            break;
          case "MON":
            i = 6;
            break;
          case "TUE":
            i = 5;
            break;
          case "WED":
            i = 4;
            break;
          case "THU":
            i = 3;
            break;
          case "FRI":
            i = 2;
            break;
          case "SAT":
            i = 1;
            break;
        }
		System.out.println(i);
	}
}