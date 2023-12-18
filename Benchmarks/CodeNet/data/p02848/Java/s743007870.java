import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String English="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] Arr_Eng = English.toCharArray();
        int N=obj.nextInt();
        String S=obj.next();
        char[] Arr1 = S.toCharArray();
        int[] ArrIndex = new int[S.length()];
        for (int i=0;i<S.length();i++){
            for (int j=0;j<26;j++){
                if(Arr1[i]==Arr_Eng[j])
                    ArrIndex[i]=j;
            }
        }
        int realIndex=N;
        for (int i=0;i<S.length();i++){
            int Sum=ArrIndex[i]+N;
            if (Sum>25) {
                realIndex = Sum - 26;
                ArrIndex[i] = realIndex;
            }
            else
            ArrIndex[i]+= realIndex;
        }
        for (int i=0;i<S.length();i++){
            System.out.print(Arr_Eng[ArrIndex[i]]);
        }
    }
}