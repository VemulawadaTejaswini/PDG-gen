import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int n = sc.nextInt();
            int sum = 0;
            if(n > 50) System.out.println(0);
            else{
                for(int i = 0; i <= 9; i++){
                    for(int j = 0; j <= 9; j++){
                        for(int k = 0; k <= 9; k++){
                            for(int l = 0; l <= 9; l++){
                                if(i+j+k+l == n) sum++;
                            }
                        }
                    }
                }
                System.out.println(sum);
            }
        }
    }
}