import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        String[] command = new String[s.length()];
        int totalFare = 0;
        int A =tring.VakueOf(s.charAt(0));
       	int B =tring.VakueOf(s.charAt(1));
      	int C =tring.VakueOf(s.charAt(2));
      	int D =tring.VakueOf(s.charAt(3));
      	if(A<B){
        	totalFare += A
        }else{
        	totalFare += B
        }
      	if(C<D){
        	totalFare += C
        }else{
        	totalFare += D
        }
       System.out.println(totalFare);
    }
}
