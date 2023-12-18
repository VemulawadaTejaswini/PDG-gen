import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static final int PER = 4;

    public static void main(String args[]){
        String[] target = args[0].split(" " , 2);
        int selected = Integer.parseInt(target[1]);

        Arrays.asList(target).forEach(System.out::println);

        List<Integer> list1 =
        Arrays
          .asList(target[2])
          .stream()
          .map(Integer::valueOf)
          .sorted((i,j) -> j - i)
          .collect(Collectors.toList());

        boolean isAllowed = isAllowed(list1 , list1.stream().reduce( (l1 , l2) -> l1 + l2).get() ,  selected);
        System.out.println(isAllowed ? "Yes" : "No");
    }

    public static boolean isAllowed(List<Integer> list , int allCount , int selected ){
        int allowedCount = allCount / (PER * selected);
        System.out.println(allowedCount);

        for(int i = 0 ; i< selected ;i++){
            if(list.get(i) < allowedCount)return false;
        }
        
        return true;
    }
}