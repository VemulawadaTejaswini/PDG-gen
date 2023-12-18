import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(1);

        for(int i=2;i<=86;i++){
            arrayList.add(arrayList.get(i-1)+arrayList.get(i-2));
        }

        System.out.println(arrayList.get(n));
    }
}