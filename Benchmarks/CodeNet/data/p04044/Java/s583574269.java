import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);

List<String> array = new ArrayList<String>();
array.add(sc.nextLine());
array.add(sc.nextLine());array.add(sc.nextLine());
Collections.sort(array);
System.out.println(array.get(0)+array.get(1)+array.get(2));
}}