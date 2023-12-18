import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 0; i < 10001; i++){
            for(int j = 0; j < 10001; j++){
                int chk = (int)Math.pow(i,5);
                int chk2 = (int)Math.pow(j,5);
                if(chk + chk2 == x){
                    System.out.println(i + " " + -j);
                    return;
                }else if(chk - chk2 == x){
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
    
}
