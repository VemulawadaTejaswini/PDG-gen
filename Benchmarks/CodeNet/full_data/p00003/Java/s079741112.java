import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] length = new int[3];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                length[j] = sc.nextInt();
            }

            Arrays.sort(length);

            if(length[0]*length[0] + length[1]*length[1] == length[2]*length[2]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}