import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] groups={1,3,1,2,1,2,1,1,2,1,2,1};
        System.out.println(groups[sc.nextInt()-1]==groups[sc.nextInt()-1]?"Yes":"No");
    }
}