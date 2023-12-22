import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(n == 0 && x == 0){
                break;
            }
            
            int sum = 0;
            for(int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j <= n ;j++){
                    for(int k = 1 ; k <= n ; k++){
                        if((i != j && j != k && i != k ) && (i + j + k == x)){
                            sum++;
                        }
                    }
                }
            }
            
            System.out.println(sum / 6);
            
        }
        
    }
}
