import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        Integer a_group[] = {1, 3, 5, 7, 8, 12};
        Integer b_group[] = {4, 6, 9, 11};
        
        if(Arrays.asList(a_group).contains(x) && Arrays.asList(a_group).contains(y)) {
            System.out.println("Yes");
        }else if(Arrays.asList(b_group).contains(x) && Arrays.asList(b_group).contains(y)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}