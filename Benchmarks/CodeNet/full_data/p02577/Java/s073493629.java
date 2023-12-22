import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String N = sc.next();

        //文字列
        String strN = N;

        char[] NChar = new char[strN.length()];
        for(int i = 0; i<strN.length(); i++){
            NChar[i] = strN.charAt(i);
            //System.out.println(NChar[i]);
        }

        int[] Nint = new int[strN.length()];
        for(int j = 0; j<strN.length(); j++){
            Nint[j] = Character.getNumericValue(NChar[j]);
            //Nint[j] = NChar[j];
            //System.out.println(Nint[j]);
        }


        //ここから計算
        int sum = 0;
        //System.out.println(Nint.length);
        for(int k = 0;k<Nint.length; k++){
            sum += Nint[k];
        }

        if(sum % 9 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        
    }
}