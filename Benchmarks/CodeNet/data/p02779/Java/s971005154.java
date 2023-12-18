import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> List = new ArrayList<>();
        boolean check = true;
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            if(List.contains(num)){
                check = false;
                break;
            }
            else {
                List.add(num);
            }
        }
        if(check) System.out.println("YES");
        else System.out.println("NO");
    }
}