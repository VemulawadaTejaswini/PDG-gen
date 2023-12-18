import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int S = sc.nextInt();
        int nam = 0;
        int total = 0;

      
      for(int a=0;a<=K;a++){
       for(int b=0;b<=K;b++){
         for(int c=0;c<=K;c++){
           total = a+b+c;
           if(total==S){nam++;}
         }
       }
      }
      System.out.print(nam);
    }
}