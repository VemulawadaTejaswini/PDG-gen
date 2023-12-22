import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
      	int num = console.nextInt();
        console.nextLine();
      
      	int ac = 0;
        int wa = 0;
        int tle = 0;
        int re = 0;
      
      	for(int i = 0; i < num; i++){
          String str = console.nextLine();
          switch(str){
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
        
        // 最終出力
        System.out.println("AC x " + ac);
        System.out.println("WA x " + wa);
     	System.out.println("TLE x " + tle);
      	System.out.println("RE x " + re);
	}
}
