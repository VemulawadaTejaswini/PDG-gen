import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      char[] c = sc.next().toCharArray();
      int cntA = 0;
      int cntB = 0;
      for(int i = 0;i < n;i++){
      	if(c[i]=='a'&&cntA+cntB<a+b){
        	System.out.println("Yes");
            cntA++;
        }else if(c[i]=='b'&&cntA+cntB<a+b&&cntB<=b){
        	System.out.println("Yes");
            cntB++;
        }else System.out.println("No");
      }
    }
}
