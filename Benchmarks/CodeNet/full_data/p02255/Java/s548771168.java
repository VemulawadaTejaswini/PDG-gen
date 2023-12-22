        public static void insertSort(int arr[]) {
           for (int i = 0; i < arr.length; i++){
               int v = arr[i];
               int j = i - 1;
               while (j >= 0 && arr[j] > v){
                   arr[j+1] = arr[j];
                   j--;
               }
               arr[j+1] = v;
               printArray(arr);
           }
        }

        public static void swap(int arr[], int i , int j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        public static void printArray(int []arr){
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            if (N >= 1 && N <= 100) {
                int[] arr = new int[N];
                for (int j = 0; j < N; j++) {
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = in.nextInt();
                    }
                    insertSort(arr);
                }
                in.close();
            }
        }
    }
