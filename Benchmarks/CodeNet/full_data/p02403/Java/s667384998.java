import java.util.Scanner;

public class Main{ 
        public static void main(String[] args){
            int i,j,a,b;
                Scanner n = new Scanner(System.in);
                while(true){
                     a = n.nextInt();
                     b = n.nextInt();
                     if(a==0 && b==0){
                         break;
                     }
                     for(i=0;i<a;i++){
                         for(j=0;j<b;j++){
                             System.out.print("#");
                         }
                         System.out.printf("\n");
                     }
                }
        }
    }
