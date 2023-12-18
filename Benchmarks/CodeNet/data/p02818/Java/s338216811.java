import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();;
        long B = scanner.nextLong();;
        long K = scanner.nextLong();;
 
        while(!(K == 0L)){
            if(!(A == 0L)){
                A--;
            }else{
                B--;
            }
          	K--;
        }
        System.out.print(A);
      	System.out.print(B);
	}
}