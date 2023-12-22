import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int AC = 0;
      	int WA = 0;
      	int TLE = 0;
      	int RE = 0;
        String a;
        for (int i=0; i<N; i++) {
            a = sc.next();
          	if(a.equals("AC")){
              AC += 1;
            }
          	else if(a.equals("WA")){
              WA += 1;
            }
          	else if(a.equals("TLE")){
              TLE += 1;
            }
          	else if(a.equals("RE")){
              RE += 1;
            }
        }
      
       	System.out.println("AC × " + AC);
      	System.out.println("WA × " + WA);
      	System.out.println("TLE × " + TLE);
      	System.out.println("RE × " + RE);
    }
}