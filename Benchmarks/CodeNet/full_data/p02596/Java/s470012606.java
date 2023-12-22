import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
 
      long K = sc.nextLong();
      long C = 0;
      long SE = 7;
      while(true){
        C++;
      	SE=SE+7*10*C;
        if(K%2==0){System.out.println(-1);
                      break;
                      }
        if(SE%K == 0){
           System.out.println(C);
           break;
        }
      }
    }
}