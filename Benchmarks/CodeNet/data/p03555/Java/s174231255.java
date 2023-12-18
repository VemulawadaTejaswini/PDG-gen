import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String list1[] = s1.split("");
        String list2[] = s2.split("");
        String ans = "";
        if(list1[0].equals(list2[2]) && list1[1].equals(list2[1]) && list1[2].equals(list2[0])){
            ans = "Yes";
            System.out.println(ans);
        }else{
            ans = "No";
            System.out.println(ans);
        }
        
    }
}
