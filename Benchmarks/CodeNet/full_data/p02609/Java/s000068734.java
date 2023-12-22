import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String X = sc.next();
      
      for(int i=0;i<N;i++){
        int count=0;
        
        String input = "";
        //ビット反転
        if(X.substring(i,i+1).equals("0")){
          input = (X.substring(0,i)).concat("1").concat(X.substring(i+1,X.length()));
        } else {
          input = (X.substring(0,i)).concat("0").concat(X.substring(i+1,X.length()));
        }
        
        long fn = Long.parseLong(input, 2);
        int popcount = replace(input,'1');
        
        while(fn>0){
          fn = fn % popcount;
          count++;
          popcount = replace(Long.toBinaryString(fn),'1');
        }
        System.out.println(String.valueOf(count));
      }
    }
    static int replace(String str, char target){
    	return str.length() - str.replace(target + "", "").length();
	}
}