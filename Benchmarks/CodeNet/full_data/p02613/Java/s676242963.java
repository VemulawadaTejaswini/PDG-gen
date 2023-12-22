import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
        String line = sc.nextLine();
      
      	int ac = 0;
        int wa = 0;
        int tle = 0;
        int re = 0;
      
      	for(int i = 0; i < n; i++) {
          String str = sc.nextLine();
          if(str.equals("AC")){
            ac++; 
          }else if(str.equals("WA")){
            wa++;
          }else if(str.equals("TLE")){
            tle++; 
          }else if(str.equals("RE")){
            re++; 
          }
        }
        
        // 最終出力
        System.out.println("AC x " + ac);
        System.out.println("WA x " + wa);
     	System.out.println("TLE x " + tle);
      	System.out.println("RE x " + re);
	}
}