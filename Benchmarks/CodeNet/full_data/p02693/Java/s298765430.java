import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
    
        int A = sc.nextInt();
        int B = sc.nextInt();
    
        int X = A/N;
        int Y = B/N;
        
        if(N==1 ||Y-X > 0) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
        
        return;
    }
  }
