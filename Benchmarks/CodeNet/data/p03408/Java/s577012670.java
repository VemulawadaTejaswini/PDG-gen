import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<a; i++){
            String str = sc.next();
            if(map.containsKey(str)){
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }

        int b = sc.nextInt();

        for(int i=0; i<b; i++){
            String str = sc.next();
            if(map.containsKey(str)){
                map.put(str, map.get(str) - 1);
            }
        }

        int max = 0;

        for(int i: map.values()){
            if(i>max){
                max=i;
            }
        }

        System.out.println(max);
    }

    public static void printListOneLine(List list){
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public static void printList(List list){
        for(int i=0; i<list.size(); i++){
            if(i == list.size()){
                System.out.println(list.get(i));
            } else {
                System.out.print(String.format("%d ", list.get(i)));
            }
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

    public static int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
}
