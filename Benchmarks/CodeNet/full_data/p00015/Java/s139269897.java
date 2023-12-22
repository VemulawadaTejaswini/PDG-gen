import java.util.Scanner;

public class Main {
   /*maximum number of digits*/
   public static final int MAX = 80;
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      
      for(int i = 0; i < n; i ++) {
         //get a pair of integers as String and fill 0s to make it length of MAX
         String a = sc.nextLine();
         String b = sc.nextLine();
         if(a.length() > MAX || b.length() > MAX) {
            System.out.println("overflow");
         } else {
            a = fill0s(a);
            b = fill0s(b);
            //craete an array of integer holding MAX numbers.
            int[] answer = new int[MAX];
         
            //add each digit of a and b
            /*at this point, elements in asnwer[] can be more than ten*/
            for(int digit = MAX - 1; digit >= 0; digit --) {
               answer[digit] += Integer.parseInt(String.valueOf(a.charAt(digit)));
               answer[digit] += Integer.parseInt(String.valueOf(b.charAt(digit)));
            }
         
            //check each element in answer[] except for answer[MAX - 1]
            //if excess 10, increase the next digit
            for(int digit = MAX - 1; digit > 0; digit --) {
               if(answer[digit] >= 10) {
                  answer[digit - 1] += answer[digit] / 10;
                  answer[digit] = answer[digit] % 10;
               }
            }
         
            if(answer[0] >= 10) {
               System.out.println("overflow");
            } else {
               print(answer);
            }
         }
         
         
      }
   }
   
   public static String fill0s(String input) {
      String ret = "";
      for(int i = 0; i < MAX - input.length(); i ++) {
         ret += "0";
      }
      
      return ret + input;
   }
   
   public static void print(int[] input) {
      boolean skip = true;
      for(int i = 0; i < input.length; i ++) {
         if(input[i] == 0 && skip) {
            continue;
         } else {
            skip = false;
            System.out.print(input[i]);
         }
      }
      
      System.out.println();
   }
   
   
}
