import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long k = scan.nextLong();
        String a = n+"";
        int po = 0;
        for (int i=0;i<a.length();i++){
            if (a.charAt(i) != '1'){
                po = i;
                break;
            }
        }

        if (k < po+1){
            System.out.println(1);
        }
        else{
            System.out.println(a.charAt(po));
        }    
    }
}