import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String inArr = sc.nextLine();
        List<Integer> list = Arrays.asList(inArr.split(" ")).stream().map(x -> Integer.parseInt(x)).collect(Collectors.toList());

        int sum = list.stream().mapToInt(x->x).sum();

        if(list.stream().filter(x -> {
            int hoge = 4 * m;
            int fuga = sum / hoge;
            if(x < fuga){
                return false;
            }else{
                return true;
            }

        }).count() >= m){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}
