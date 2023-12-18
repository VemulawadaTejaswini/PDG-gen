import java.util.Scanner;

class Main{
  
   public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
     
     int s = sc.nextInt();
     
     int[]a = new int[1000000];
     
     for (int i == 0; i  < a.length; i++){
       if (i = 0)
         a[i] = s;
       else {
         if (a[i-1] % 2 ==0){
           a[i] = a[i-1] /2;
         }else{
           a[i] = a[i-1] * 3 +1;
         }
       }
     }
     
     int c = 0;
     
     for (int i = 0; i < a.length; i++){
       for (int j = 1; j < a.length; j++){
         if (a[i] == a[j]){
           c = j + 1;
           break;
         }
       }
     }
     
     System.out.println(c);
     
     sc.close();
   }
}