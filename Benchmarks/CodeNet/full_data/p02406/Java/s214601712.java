import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        //整数1～nのの値を確認
        for(int i=1; i<=n; i++){
            //iが3の倍数の場合(を3で割った余りが0)、または3を含む場合
            if(i%3 == 0 || Integer.toString(i).contains("3")){
                sb.append(i);
                sb.append(" ");
            }
        }
        //最後の空白削除
        sb.deleteCharAt(sb.lastIndexOf(" "));
        
        System.out.println(sb);
        

    }

}

