import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = String.valueOf(n);
        int cnt = 0;
        
        for(int i = 0;i<num.length();i++){
            cnt+=(num.charAt(i)-'0');
        }

        if(n%cnt==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}
