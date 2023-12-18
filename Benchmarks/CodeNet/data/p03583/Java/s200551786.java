import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.close();

        for(int i = 1; i <= 3500; i++){
            for(int j = 1; j <= 3500; j++){
                int m = 4*i*j-N*(i+j);
                if(m <= 0)
                    continue;
                else {
                    if(N*i*j%m == 0){
                        System.out.println(i + " " + j + " " + N*i*j/m);
                        return;
                    }
                }
            }
        }
    }
}