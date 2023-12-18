import java.util.*;

public class Main{
        public  static void main(String[] args){

                int r=calc();
                System.out.println(r);
        }
        static int calc(){
                Scanner sc = new Scanner(System.in);
                int A=sc.nextInt();
                int B=sc.nextInt();
                int C=sc.nextInt();
                int result = C-(A-B);

                return result;
        }
}