import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        
        int min = 2019;
        if(R-L >= 2019){
            System.out.println(0);
        } else{
            for(int i=L; i<R; i++){
                for(int j=i+1; j<R+1; j++){
                    int mod = (i*j)%2019;
                    if(mod<min){
                        min = mod;
                    }
                }
            }
            System.out.println(min);
        }
        
    }
}