import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mountainArray[] = new int[10];
        for(int i = 0; i < 10; i++){
            mountainArray[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++){
            for(int j = i + 1; j < 10; j++){
                if(mountainArray[i] < mountainArray[j]){
                    int temp = mountainArray[i];
                    mountainArray[i] = mountainArray[j];
                    mountainArray[j] = temp; 
                    
                }
            }
        }
        for(int i = 0; i < 3; i++){
            System.out.println(mountainArray[i]);
            
        }
        
    }
}
