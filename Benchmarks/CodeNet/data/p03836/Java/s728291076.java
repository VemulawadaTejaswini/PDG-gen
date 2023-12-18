import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt() - a;
                int d = sc.nextInt() - b;
                sc.close();
                for(int i = 0 ; i < c ; i++){
                        System.out.print("R");
                }
                for(int i = 0 ; i < d ; i++){
                        System.out.print("U");
                }
                for(int i = 0 ; i < c ; i++){
                        System.out.print("L");
                }
                for(int i = 0 ; i <= d ; i++){
                        System.out.print("D");
                }
                for(int i = 0 ; i <= c ; i++){
                        System.out.print("R");
                }
                for(int i = 0 ; i <= d ; i++){
                        System.out.print("U");
                }
                System.out.print("LU");
                for(int i = 0 ; i <= c ; i++){
                        System.out.print("L");
                }
                for(int i = 0 ; i <= d ; i++){
                        System.out.print("D");
                }
                System.out.println("R");
        }
}