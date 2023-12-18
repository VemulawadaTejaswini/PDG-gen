import java.util.*;

public class Main{
        public static void main(String[] args){
                Scanner scan = new Scanner(System.in);
                int N = scan.nextInt();
                double money[] = new double[N];
                String kind[] = new String[N];
                double res=0;

                for(int i = 0;i<N;i++ ){
                        money[i] = scan.nextDouble();
                        kind[i] = scan.next();
                }

                for(int i = 0;i<N;i++ ){
                        if(kind[i].equals("JPY")){
                                res += money[i];
                        }else{
                                res += money[i]*380000;
                        }
                }
                System.out.println(res);
        }
}