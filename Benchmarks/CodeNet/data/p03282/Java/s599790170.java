import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String strk = sc.next();
        
        int k = 9999;
        if(strk.length() < 3) k = Integer.parseInt(strk);
        String[] arr = n.split("");
        
        //1文字の時
        if(arr.length == 1)System.out.println(n);
        else{
            //2文字以上の時
            boolean flag = true;
            int count = 0;
            int leng = arr.length;
            for(int i = 0; i < leng; i++){
                //前から1が何個続くか
                if(flag && arr[i].equals("1")) count++;
                else flag = false;
                
            }
            
            if(count < k)System.out.println(arr[count]);
            else System.out.println(1);
        }
        
    }
}