import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] s = new int[5];
        int[] c = new int[5];
        for(int i=0;i<M;i++){
            s[i] = Integer.parseInt(sc.next());
            c[i] = Integer.parseInt(sc.next());
        }
        int[] result = new int[3];
        for(int i=0;i<M;i++){
            if(s[i] == 1 && c[i] == 0 && N != 1){
                result[0] = -1;
                break;
            }else{
                if(result[s[i] - 1] != 0 && result[s[i] - 1] != c[i]){
                    result[0] = -1;
                    break;
                }else{
                    result[s[i] - 1] = c[i];
                }
            }
        }
        if(result[0] == -1){
            System.out.println(result[0]);
        }else{
            switch(N){
                case 1:
                    System.out.println(result[0]);
                    break;
                case 2:
                    result[0] = result[0] == 0 ? 1 : result[0];
                    System.out.println(result[0] * 10 + result[1]);
                    break;
                case 3:
                    result[0] = result[0] == 0 ? 1 : result[0];
                    System.out.println(result[0] * 100 + result[1] * 10 + result[2]);
                    break;
            }
        }
    }
}
