import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        long K=sc.nextLong();
        if(K==1){
            System.out.println(s.charAt(0));
        }else{
            if(s.charAt(0)=='1'){
                System.out.println(s.charAt(1));
            }else{
                System.out.println(s.charAt(0));
            }
        }
    }
}
