import java.util.Scanner;

public class Main {
    private static void insertionSort(int[] list) {
        int len = list.length;
        printList(list);
        for (int i=1;i<len;i++){
            int move = list[i];
            int j = i-1;
            while (j>=0 && list[j] > move){
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = move;
            printList(list);
        }
    }
    private static void printList(int[] list){
        for (int i=0;i<list.length;i++){
            System.out.printf("%d",list[i]);
            if (i != list.length-1){
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }
    public static void main(String args[]){
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] list = new int[n];

        for (int i=0;i<n;i++){
            list[i] = scanner.nextInt();
        }
        insertionSort(list);
    }
}

