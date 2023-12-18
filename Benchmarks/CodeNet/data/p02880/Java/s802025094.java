import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                list.add(i*j);
            }
        }
        
        System.out.println(list.contains(n)?"Yes":"No");
    }
}