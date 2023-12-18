import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        String s = sc.next();
        int tail = s.length();
        String ans = "NO";
        while(tail >= 3){
            if(s.substring(tail - 3, tail).equals("eam")){
                tail -= 5;
            }else if(s.substring(tail - 3, tail).equals("mer")){
                tail -= 7;
            }else if(s.substring(tail - 3, tail).equals("ase")){
                tail -= 5;
            }else if(s.substring(tail - 3, tail).equals("ser")){
                tail -= 6;
            }else{
                System.out.println("NO");
                return;
            }
        }

        if(tail == 0) ans = "YES";
        System.out.println(ans);
    }
}