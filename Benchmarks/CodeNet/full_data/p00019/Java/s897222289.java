import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                sc.close();
                int p = 1;
                while(n > 1){ 
                        p *= n--;
                }   
                System.out.println(p);
        }   
}