import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];
        String[] lines = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(lines[i]);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(list[i]<list[j]){
                    int temp=list[i];
                    list[i]=list[j];
                    list[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(list[i]);
            if(i!=n-1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}