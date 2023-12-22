import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String [] s_arr = sc.nextLine().split("");
        String [] t_arr = sc.nextLine().split("");
        
        //sの文字列長文loopして全部同じかどうかをチェックする
        boolean flg = true;
        for (int i=0;i<s_arr.length;i++){
            if (s_arr[i].equals(t_arr[i])){
                //
            }else{
                flg = false;
            }
        }
        
        if (flg){
            System.out.println("Yes");    
        }else{
            System.out.println("No");    
        }

    }
}
