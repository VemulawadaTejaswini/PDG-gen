import java.util.Scanner;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int v[] = new int[n];
        for(int i = 0; i < n; i++){
            v[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(v[i] > v[j]){
                    int v0 = v[i];
                    v[i] = v[j];
                    v[j] = v0;
                }
            }
        }

        double x0 = (v[0] + (double)v[1]) / 2.0;
        for(int i = 2;i < n;i++){
            double x = (x0 + (double)v[i]) /2.0;
            x0 = x;
        }
        System.out.println(x0);
    }
}