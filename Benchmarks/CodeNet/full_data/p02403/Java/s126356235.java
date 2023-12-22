import java.util.Scanner;

public class Main{ 
        public static void main(String[] args){
            int i,j,a,b;
                Scanner n = new Scanner(System.in);
                     a = n.nextInt();
                     b = n.nextInt();
                     for(i=0;i<a;i++){
                         for(j=0;j<b;j++){
                             System.out.print("#");
                         }
                         System.out.println("");
                     }
        }
    }
