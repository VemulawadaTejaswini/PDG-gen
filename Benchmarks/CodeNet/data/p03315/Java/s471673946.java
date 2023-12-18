import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] sArr = sc.next().split("");

        int num = 0;
        for(int i = 0; i < sArr.length; i++){
            if(sArr[i].equals("+")){
                num++;
            }
            else{
                num--;
            }
        }
        System.out.println(num);
        
    }
}
