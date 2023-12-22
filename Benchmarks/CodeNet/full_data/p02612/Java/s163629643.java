import java.util.*;
    public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
          
            int a = n%1000;
          	int b = 0;
          	if(a!=0){
              b= 1000 -a;
            }
            System.out.println(b);
        }
    } 