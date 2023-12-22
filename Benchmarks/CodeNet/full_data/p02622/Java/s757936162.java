import java.util.Scanner;
public class Main{
  public static void main(String[] args){
 		Scanner sc = new Scanner(System.in);
    	String S = sc.nextInt();
    	String T = sc.nextInt();
    	int count = 0;
    if(S == T){
     	System.out.println("0"); 
    }else{
     	for(int i=0;i<S.length();i++){
          	if(S.charAt(i) != T.charAt(i)){
              	S.charAt(i) == T.charAt(i);
              	count++;
            }
        }
    }
    	System.out.println(count);
  }
}
