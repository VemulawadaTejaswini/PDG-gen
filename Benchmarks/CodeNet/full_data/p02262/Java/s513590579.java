import java.util.*;


public class Main{
   int count;

    public static void main(String[] args){
			new Main();
    }

		public Main(){
			Scanner scan = new Scanner(System.in);
				int n = scan.nextInt();
				int arr[] = new int[1000000];

				for(int i=0;i<n;i++){
						arr[i] = scan.nextInt();
				}
				shellSort(arr, n);
				printArray(arr, n);
		}


    public void insertSort(int arr[], int n, int g){
        for(int i=g;i<n;i++){
            int v = arr[i];
            int j = i - g;
            while(j >=0 && arr[j] > v){
                arr[j+g] = arr[j];
                j = j -g;
                count++;
            }

            arr[j+g] = v;
        }
    }

    public void shellSort(int arr[], int n){
        count = 0;
        int i, j, m;
        int G[] = new int[100];
        if(n < 3){
            G[0] = n;
            G[1] = n-1;
            G[2] = 1;
            m = n;
        }else{
            j = 0;
            for(i=1;i<n;i=i*3+1){
                G[j++] = i;
            }
            m = j;
        }
        System.out.println(m);
        for(i=m-1;i>=1;i--){
            System.out.print(G[i] + " ");
        }
        System.out.println(G[i]);

        for(i=m-1;i>=0;i--){
            insertSort(arr, n, G[i]);
        }
        System.out.println(count);
    }

    public static void printArray(int arr[], int n){
        int i;
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}

