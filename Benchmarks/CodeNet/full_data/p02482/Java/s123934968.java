import java.util.*;
class main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt(), b = sc.nextInt();
                if(a<b){
                        System.out.println("a < b");
                }else if(a>b){
                        System.out.println("a > b");
                }else{
                        System.out.println("a == b");
                }
        }
}