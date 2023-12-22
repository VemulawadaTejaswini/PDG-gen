import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");
        int[] A = new int[n];
        for (int i = 0; i< n; i++){
            A[i] = Integer.parseInt(a[i]);
        }
        
        int q = Integer.parseInt(br.readLine());
        String[] b = br.readLine().split(" ");
        int[] Q = new int[q];
        for (int i = 0; i < q; i++){
            Q[i] = Integer.parseInt(b[i]);
        }
        
        int pow = (int) Math.pow(2,n)-1;
        String[] bits = new String[pow];
        for (int i=0; i<pow; i++){
            bits[i] = String.format("%0"+ n + "d", Long.parseLong(Long.toBinaryString(pow-i)));   
        }
        for (int k=0; k<q; k++){
            boolean flag = false;
            for (int i=0; i<pow; i++){
                int tot = 0;
                for (int j=0; j<bits[i].length(); j++){
                    if(bits[i].charAt(j)==49){ //"1" == 49
                        tot += A[j];
                    }
                }
                if (tot == Q[k]){
                    System.out.println("yes");
                    flag = true;
                    break;
                }
            }
            if (flag == false){
                System.out.println("no");
            }
        }
    }
}