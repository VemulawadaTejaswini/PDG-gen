import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        scanner.close();

        List<String> list = new ArrayList<>();
        for(int i = 0; i < a.length() ; i++){
            list.add(a.substring(i,i+1));
        }
        Map<String,Integer> map = list.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.summingInt(s->1))
        );

        int count = map.get("0") > map.get("1") ? map.get("1") : map.get("0");
        System.out.println(count * 2);
    }
}
