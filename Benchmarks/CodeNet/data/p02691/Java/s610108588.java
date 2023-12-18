import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        String y ="";
        try {
            x = Integer.parseInt(br.readLine());
            y = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] z = y.split(" ");
        int l = z.length;
        int[] A = new int[l];
        for(int i =0;i<l;i++){
            A[i]=Integer.parseInt(z[i]);
        }
        int cnt = 0;
        for(int i =0;i<l-1;i++){
            for(int j = i+1;j<l;j++){
                if(j-i==A[j]+A[i]){
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}
