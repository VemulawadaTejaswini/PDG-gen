import java.util.*;

public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    int n = scanner.nextInt();
//    int[] arr = new int[m];
//    for (int i = 0; i < m; i++) {
//        arr[i] = scanner.nextInt();
//    }
//    Arrays.sort(arr);
//    reverse(arr);
//    int sum = 0;
//    for (int i = 0; i < n; i++) {
//        sum += arr[i];
//    }
    ArrayList arrayList=new ArrayList();
    for (int i = 0; i <m; i++) {
        arrayList.add(scanner.nextInt());
    }
    Collections.sort(arrayList);
    Collections.reverse(arrayList);
    int sum=0;
    for (int i = 0; i <n; i++) {
        int arr= (int) arrayList.get(i);
        sum+=arr;
    }
//    System.out.println(sum);

    System.out.println(sum);
}