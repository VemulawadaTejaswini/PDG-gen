import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<10; i++){
            for(int k=i; k<10; k++){
                if(i*k==N){
                    System.out.println("Yes");
                    return;
                }
            }
        }

        
        
        
        
        
        
        
        
        
        
        
        
          System.out.println("No");
        }
    }