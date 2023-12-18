import java.util.*;
public class Main {

    public static void main(String __[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String D[] = new String[K];
        for(int x=0; x<D.length; x++){
            D[x] = sc.next();
        }

        for(int i = N; i<=10000;i++){
            String str = String.valueOf(i);
            boolean validMoney = true;
            for(int j=0; j<str.length(); j++){
                for(int k = 0; k<D.length; k++){
                    if(String.valueOf(str.charAt(j)).equals(D[k])){
                        validMoney = false;
                    }
                }
            }

            if(validMoney){
                System.out.println(str);
                break;
            }
        }
    }
}