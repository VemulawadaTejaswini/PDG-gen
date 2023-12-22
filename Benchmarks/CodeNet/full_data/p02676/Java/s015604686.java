import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();

        String M=scan.next();

      if(M.length()<=N){System.out.println(M);}
      else{
          String Ns=M.substring(0,N);
          System.out.println(Ns+"...");
      }
    }

}

