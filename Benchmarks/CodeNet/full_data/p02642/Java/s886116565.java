import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();
        int[] a = new int[n+1];

        for(int i=0; i<n; i++)
            a[i] = read.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(i!=j && a[i]%a[j] != 0){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
