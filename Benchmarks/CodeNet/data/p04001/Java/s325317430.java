import java.util.Scanner;
public class Main{

   int[] sequence;

   public static void main(String[] args){
      new Main().solve();
   }

   public void solve(){
      long sum = 0;
      String line = new Scanner(System.in).nextLine();
      sequence = new int[line.length()];

      for(int i=0; i<line.length(); i++){
         sequence[i] = Character.getNumericValue(line.charAt(i));
      }

      for(int i=0; i<(int)Math.pow(2.0,line.length()-1); i++){
         sum += addition(i);
      }

      System.out.println(sum);

   }

   public long addition(int pattern){
      boolean isOne = false;
      long temp = sequence[0];
      long sum = 0;
      for(int i=0; i<sequence.length-1; i++){
         if((pattern >> i & 0x1) == 1){
            sum += temp;
            temp = sequence[i+1];
            isOne = true;
         }else{
            isOne = false;
            temp *= 10;
            temp += sequence[i+1];
         }
      }
      sum += temp;
      return sum;
   }

}