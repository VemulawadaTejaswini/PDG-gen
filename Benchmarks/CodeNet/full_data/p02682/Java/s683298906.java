import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        sc.close();

            for(int i= 0; i < k; i++){
                
                if(a>0){
                    sum++;
                    a--;
                }else if(b>0){
                    b--;
                }else{
                    sum--;
                    c--;
                }
            }
            System.out.println(sum);

    } 
}