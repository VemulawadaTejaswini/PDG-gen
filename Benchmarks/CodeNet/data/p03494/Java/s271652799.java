
import java.util.Scanner;
 
class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] numbers = new int[n];
        
        for(int i=0 ; i< n ;i++){
            numbers[i] = sc.nextInt();
        }
        
        boolean flag = true;
        int count = 0;
        
        for(int j=0; j<n; j++){
            if(numbers[j] %2 == 0){
            numbers[j] /= 2;
            }else{
                flag = false;
                break;
            }
            
            count ++;
        }
        
        System.out.println(count);
    }
}