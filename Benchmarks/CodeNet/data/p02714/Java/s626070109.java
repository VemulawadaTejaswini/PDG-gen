import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int opt = 0;
        for(int i=0;i<S.length()-2;i++){
            for(int j=i+1;j<S.length()-1;j++){
                int num = 2*j-i;
                if(S.charAt(i)!=S.charAt(j)) {
                    for (int k = j + 1; k < S.length(); k++) {
                        if(S.charAt(i)!=S.charAt(k)&&S.charAt(j)!=S.charAt(k)&&k!=num) opt++;
                    }
                }
            }
        }
        System.out.println(opt);
    }
}