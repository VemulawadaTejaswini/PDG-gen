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
        if(input.substring(i,i+1)equals("0")){
          input = X.substring(0,i).concat("1").concat(i+1,X.length());
        } else {
          input = X.substring(0,i).concat("0").concat(i+1,X.length());
        }
        
        int fn = Integer.parseInt(input, 2);
        int popcount = input.split("1").length - 1;
        
        while(fn>0){
          fn = fn % popcount;
          count++;
          popcount = Integer.toBinaryString(fn).split("1").length - 1;
        }
        System.out.println(String.valueOf(count));
      }
    }
}
        
        