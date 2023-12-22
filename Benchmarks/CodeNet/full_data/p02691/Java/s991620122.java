import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 0; i <= x; i++){
            boolean flug = false;
            int chk = (int)Math.pow(i,5);
            if(chk < x){
                flug = true;
            }
            for(int j = 0; j <= x; j++){
                if(flug){
                    int chk2 = chk + (int)Math.pow(j,5);
                    if(chk2 == x){
                        System.out.println(i + " " + (-j));
                        return;
                    }else if(chk2 > x){
                        break;
                    }
                }else{
                    int chk2 = chk - (int)Math.pow(j,5);
                    if(chk2 == x){
                        System.out.println(i + " " + (-j));
                        return;
                    }else if(chk2 < x){
                        break;
                    }
                }
            }
        }
    }
}
