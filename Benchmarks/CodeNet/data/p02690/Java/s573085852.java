import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 0; i <= x; i++){
            for(int j = 0; j <= x; j++){
                int chk1 = (int)Math.pow(i,5) + (int)Math.pow(j,5);
                int chk2 = (int)Math.pow(i,5) - (int)Math.pow(j,5);
                if(chk1 == x){
                    System.out.println(i + " " + (-j));
                    return;
                }else if(chk2 == x){
                    System.out.println(i + " " + j);
                    return;
                }
                if(Math.abs(chk1) > x && Math.abs(chk2) > x){
                    break;
                }
            }
        }
    }
}
