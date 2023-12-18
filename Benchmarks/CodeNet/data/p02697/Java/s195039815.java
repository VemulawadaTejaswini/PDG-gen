import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int start = n/2;
        int count = 0;
        if(n % 2 == 1){
            for(int i = 0; i < m; i++){
                System.out.println((start-count) + " " + (start+1+count));
                count++;
            }
        }else{
            for(int i = 0; i < m; i++){
                if(i <= n/2){
                    System.out.println((start-count) + " " + (start+1+count));
                }else{
                    System.out.println((start-count) + " " + (start+2+count));
                }
                count++;
            }
        }
        
    }
}

