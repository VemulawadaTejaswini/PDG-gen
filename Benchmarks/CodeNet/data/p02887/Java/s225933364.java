import java.util.*; 
class Main {
   public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
       int sam = sc.nextInt();
       String ss = sc.next();
       
       int cnt = 0;
       char cc = '0';
       char hh = '0';
       for(int i = 0; i < sam; i++){
           hh = ss.charAt(i);
           if(cc != hh){
               cnt++;
               cc = hh;
           }
       }
     System.out.print(cnt);
   }
}