import static java.lang.System.out;
 public class Main {
     public static void main(String[] args){
         String str = new java.util.Scanner(System.in).nextLine();
         String[] tmp = str.split(" ");
         int a = Integer.parseInt(tmp[0]);
         int b = Integer.parseInt(tmp[1]);
         int c = Integer.parseInt(tmp[2]);
         int tmprun;
 
         for(int i = 0;i <= 2;i++){
             if(c < b){
                 tmprun = c;
                 c = b;
                 b = tmprun;
             }
             if(b < a){
                 tmprun = b;
                 b = a;
                 a = tmprun;
             }
         }
         out.print(a + " ");
         out.print(b + " ");                                                                                                                
         out.println(c);
     }
 }