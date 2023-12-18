import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        String[] S = str.split("");
        int Maxcount = 0;
        int count = 0;

        for(int i=0; i<S.length;i++){
            count =0; 
            for(int j=i; j<S.length; j++){
                if("A".equals(S[j]) || "C".equals(S[j]) || "G".equals(S[j]) || "T".equals(S[j])){
                    count ++;
                }else{
                    break;
                }
            }
            Maxcount = Math.max(count, Maxcount);
        }
        System.out.println(Maxcount);
    }
}