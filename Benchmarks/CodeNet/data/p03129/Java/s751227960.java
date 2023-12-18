import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        if(N<100){
            if(N>1){

              if(N>K){
                  System.out.println("YES");
              }else{
                System.out.println("NO");

              }
            }
        }
    }

}