import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] Ans = new int[100];

        for(int i = 0; i < n; i++){
           int x1 = stdIn.nextInt();
           int x2 = stdIn.nextInt();
           int x = x1 * x2;
           int cnt = 0;
           int j = 1;
           int k = x - 1;
           
           while(j < x){     
               if(j == x1)
                   j++;
               if(k == x2)
                   k--;
               
               while(k > 0){
                   if(j * k < x){
                       cnt++;
                       k--;
                       break;
                   }
                   k--;
               }
               j++;
           }
         
           Ans[i] = cnt;
        }

        for(int i = 0; i < n; i++)
            System.out.println(Ans[i]);
    }
}