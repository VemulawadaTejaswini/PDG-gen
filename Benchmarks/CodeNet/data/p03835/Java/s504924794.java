import java.util.*;


class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int K = sc.nextInt();
        int S = sc.nextInt();

        int sum = 0;

        for(int x = 0;x <= K;x++){
            if(x > S) break;
           for(int y = 0;y <= K;y++){
               if(x + y > S) break;
               for(int z = 0;z <= K;z++){
                   int num = x + y + z;
                   if(num > S) break;
                   if(num == S){
                       sum++;
                   }
               }
           } 
        }
        System.out.println(sum);
    }
}