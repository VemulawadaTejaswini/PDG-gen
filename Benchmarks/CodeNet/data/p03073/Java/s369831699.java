import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int pate1 = 0;
    int pate2 = 1;
    int ans = 0;    
    for(int i = 1;i < S.length();i++){
      pate1 = (i % 2 == 0) ? pate1*10 : pate1*10+1;
      pate2 = (i % 2 == 1) ? pate2*10 : pate2*10+1;
    }
    String pate11 = "0"+String.valueOf(pate1);
    String pate22 = String.valueOf(pate2);

  
    //分解！
    String[] Ssplit = S.split("");
    String[] pate1split = pate11.split("");
    String[] pate2split = pate22.split("");

    int count1 = 0;
    int count2 = 0;
    for(int i = 0;i < S.length();i++){
      if(!(Ssplit[i].equals(pate1split[i]))){
        count1++;
      }
    }
    for(int i = 0;i < S.length();i++){
      if(!(Ssplit[i].equals(pate2split[i]))){
        count2++;
      }
    }
    ans = count1 >= count2 ? count2 : count1;
    System.out.println(ans);
  	}
}