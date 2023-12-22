import java.util.Scanner;

public class Main {
        static int  cnt =0;
        public static void selectSort(int arr[]) {
            if (arr == null || arr.length < 2){
                return;
            }

            for (int i = 0; i < arr.length; i++){
                int minIdex = i;
                for (int j = i; j < arr.length; j++){
                    minIdex = arr[minIdex] > arr[j] ? j : minIdex;
                }
                swap(arr,i,minIdex);
                if (i != minIdex){
                    cnt++;
                }
            }
        }

        public static void swap(int arr[], int i , int j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        public static void printArray(int []arr){
            System.out.print(arr[0]);
            for(int i = 1; i < arr.length; i++) {
                System.out.print(" " + arr[i]);
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            int[] arr = new int[N];
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = in.nextInt();
                    }
            selectSort(arr);
                    printArray(arr);
            System.out.println(cnt);
                }

            }


