import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 50; i++){
            
            int m = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
        
            if(m == -1 && f == -1 && r == -1){
                break;
            }
            else if((m == -1 || f == -1) || (m + f < 30)){
                System.out.println("F");
            }
            else if(m + f >= 80){
                System.out.println("A");
            }
            else if(65 <= m + f && m + f < 80){
                System.out.println("B");
            }
            else if(50 <= m + f && m + f < 65){
                System.out.println("C");
            }
            else if(30 <= m + f && m + f < 50){
                if(r >= 50){
                    System.out.println("C");
                }
                else{
                    System.out.println("D");
                }
            }
        }
        sc.close();
    }
}
