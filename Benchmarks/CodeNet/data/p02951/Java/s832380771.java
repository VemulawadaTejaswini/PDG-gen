import java.util.*;

public class a{
        public  static void main(String[] args){
                calc();
        }
        static int calc(){
                Scanner sc = new Scanner(System.in);
                int A=sc.nextInt();
                int B=sc.nextInt();
                int C=sc.nextInt();
                int result = C-A+B;

                return result;
        }
}