import java.util.Scanner;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int q = sc.nextInt();
        int a[] = new int[n-1];
        int b[] = new int[n-1];
        int count[] = new int[n];
        for(int i = 0; i < n-1; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            count[i] = 0;
        }
        count[n-1] = 0;
        for(int i = 0; i < q; i++){
            int p = sc.nextInt();
            int x = sc.nextInt();
            count[p-1] += x;
        }

        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(i == b[j]-1){
                    count[i] += count[a[j]-1];
                    break;
                }
            }
        }

        for(int i = 0; i < n-1; i++){
            System.out.print(count[i]+" ");
        }
        System.out.println(count[n-1]);
    }
}