import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer[] one = {1, 3, 5, 7, 8, 10, 12};
        Integer[] two = {4, 6, 9, 11};
        Integer[] three = {2};

        List<Integer> oneList = Arrays.asList(one);
        List<Integer> twoList = Arrays.asList(two);
        List<Integer> threeList = Arrays.asList(two);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if((oneList.contains(x) && oneList.contains(y)) ||
                (twoList.contains(x) && twoList.contains(y)) ||
                (threeList.contains(x) && threeList.contains(y))
                ){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            if(i == array.length){
                System.out.println(array[i]);
            } else {
                System.out.print(String.format("%d ", array[i]));
            }
        }
    }
}
