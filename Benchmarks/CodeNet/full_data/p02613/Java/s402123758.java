import java.util.Scanner;
 
public class Main {
 
	static Main instance = new Main();
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        int AC = 0;
        int WA = 0;
        int TLE = 0;
        int RE = 0;
        for(int i = 0; i < n; i++){
          String s = sc.next();
          switch(s){
            case "AC":AC++;break;
            case "WA":WA++;break;
            case "TLE":TLE++;break;
            case "RE":RE++;break;
          }
        }
 
		
		System.out.println("AC"+" "+"x"+" "+AC);
        System.out.println("WA"+" "+"x"+" "+WA);
        System.out.println("TLE"+" "+"x"+" "+TLE);
        System.out.println("RE"+" "+"x"+" "+RE);
        
	}
}