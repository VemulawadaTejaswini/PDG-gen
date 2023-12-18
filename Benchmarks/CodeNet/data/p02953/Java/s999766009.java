import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        boolean ansFlag = true;
        int max = Integer.parseInt(sc.next()) - 1;
        for(int i = 1;i<n;i++){
            int tmp = Integer.parseInt(sc.next());
            if(tmp > max){
                tmp -= 1;
            }
            if(tmp < max){
                ansFlag = false;
                break;
            }
            max = Math.max(max,tmp);
        }
        if(ansFlag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}