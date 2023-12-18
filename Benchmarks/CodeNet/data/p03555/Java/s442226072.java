import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] n = sc.next().toCharArray();
        char[] n2 = sc.next().toCharArray();

        if(n[0]==n2[2] && n[1]==n2[1] && n[2]==n2[0]){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }

}
