import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();
        
        int n = 0;
        long str = 1;
        for(int i=0; i<S.length()-3; i++){
            for(int j=i+4; j<=S.length(); j++){
                str = Long.parseLong(S.substring(i,j));
                if(str%2019 == 0){
                    n++;
                }
            }
        }
        System.out.println(n);
    }
}