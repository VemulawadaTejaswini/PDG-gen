import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int ret=0;
    String S = sc.next();
    for (int i=0; i<S.length()-3;i++){
      for (int j=i+4;j<S.length()+1;j++) {
    	long a = Long.parseLong(S.substring(i,j));
    	if (a % 2019==0){
    		ret++;
    	}
      }
    }

    System.out.println(ret);
  }
}
