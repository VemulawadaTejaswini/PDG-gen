import java.util.Scanner;

public class Main {

        public static void insertSort(int arr[],int N) {
           for (int i = 0; i < N; i++){
               int v = arr[i];
               int j = i - 1;
               while (j >= 0 && arr[j] > v){
                   arr[j+1] = arr[j];
                   j--;
               }
               arr[j+1] = v;
               printArray(arr,N);
           }
        }

        public static void swap(int arr[], int i , int j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        public static void printArray(int []arr , int N){
            for (int i = 0; i < N; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int[] arr = new int[100];
            int N = in.nextInt();

                for (int j = 0; j < N; j++) {
                    for (int i = 0; i < N; i++) {
                        arr[i] = in.nextInt();
                    }
                    insertSort(arr,N);
                }
                in.close();
            }
        }
