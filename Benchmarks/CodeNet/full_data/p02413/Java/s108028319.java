import java.util.Scanner;

class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();

        int array[][] = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                array[i][j] = sc.nextInt();
            }
        }
        int ar[] = new int[c];
        int allsum = 0;

        for(int i = 0; i < r; i++){
            int sum = 0;
            for(int j = 0; j < c; j++){
                ar[j] += array[i][j];
                sum += array[i][j];

                System.out.print(array[i][j] + " ");
            }
            allsum += sum;
            System.out.print(sum);
            System.out.println();
        }
        for(int i = 0; i < c; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.print(allsum);
        System.out.println();
    }
}
