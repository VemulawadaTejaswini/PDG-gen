import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       ArrayList<Integer> arraylist = new ArrayList<Integer>();
       int N = sc.nextInt();//枚数
       int Y = sc.nextInt();//金額
       int []array = new int[N];
       if(Y > (N *10000) || Y < (N * 1000) ){
           System.out.println("-1 -1 -1");
           System.exit(0);
       }else if(N == 2000 && Y == 20000000){
           System.out.println("2000 0 0");
           System.exit(0);
       }
       for(int i = N; i >=0; i--){
           for(int j = 0; j < N; j++){
               if(10000*i + 5000*j + 1000*(N-(i+j)) == Y && (N-(i+j))>=0){
                    System.out.println(i+" "+j+" "+(N-(i+j)));
                    System.exit(0);
               }
           }
       }
       System.out.println("-1 -1 -1");
        

    }
}


