import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner stdIn = new Scanner(System.in);

       int n = stdIn.nextInt();
       char[] target = stdIn.next().toCharArray();
       int cnt = 0;
       for(int i=0;i<n;i++){
           char[] board = stdIn.next().toCharArray();
           int interval = 0;
           int s = 0;
           char now = target[0];
               for(int k=0;k<board.length;k++){
                   char search = board[k];
                   if(now==search){
                   for(int m=k+1;m<board.length;m++){
                	   if(target[1]==board[m]){
                		   interval = m-k;
                           for(int p=2;p<target.length;p++){
                        	   int next = m+interval;
                               if(next>=board.length){
                            	   break;
                               }
                               if(target[p]!=board[next]){
                                   break;
                               }
                               if(p+1==target.length){
                                   cnt++;
                                   s++;
                                   break;
                               }
                           }
                       }
                	   if(s != 0) break;
                   }
               }
           }
       }
       System.out.println(cnt);
   }
}