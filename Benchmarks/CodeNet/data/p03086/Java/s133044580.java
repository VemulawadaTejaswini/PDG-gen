import java.util.*;

public class Main {

    private static void nCombination3(int c) {
        int count = c;
        int num = 0;
        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    num++;
                }
            }
        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        char[] S=sc.next().toCharArray();
        int begin = 0;
        int length = 0;
        int currentlength = 0;
        int maxbegin = 0;
        for(int i=0;i<S.length;i++){
            if(S[i]=='A'||S[i]=='C'||S[i]=='G'||S[i]=='T'){
                if(currentlength == 0){
                    begin = i;
                }
                currentlength++;

            }else{
                if(currentlength>length){
                    length = currentlength;
                    maxbegin = begin;
                }
                currentlength = 0;
            }
        }
        System.out.println(length);

    }
}
