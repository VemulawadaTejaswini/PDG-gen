import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String _S = sc.nextLine();
        char S[] = new char[_S.length()];
        for (int i = 0; i<_S.length(); i++){
            S[i] = _S.charAt(i);
        }
        track(S);
    }

    static void track(char[] LR){
        int tmp[] = new int[LR.length];
        int numbers[]=new int[LR.length];
        for (int i = 0; i<tmp.length; i++){
            numbers[i] = 1;
            tmp[i]=1;
        }
        for (int j = 0; j<Math.pow(10,1);j++){
            int aa[] =new int[LR.length];
            for (int i  = 0; i< LR.length; i++){
                if (numbers[i] != 0){

                    if (LR[i] =='R'){
                        aa[i] = numbers[i];
                        numbers[i]=0;
                        if (i>0&&aa[i-1] !=0){
                            numbers[i]+=aa[i-1];
                        }

                    }else {
//                        tmp[i-1] += numbers[i];
//                        tmp[i] -= numbers[i];
                        aa[i]=0;
                        numbers[i-1] += numbers[i];
                        numbers[i] =0;
                        if (i>0&&aa[i-1] !=0){
                            numbers[i]=aa[i-1];
                        }

                    }

                }
            }
        }

        for (int s:numbers){
            System.out.print(s+" ");
        }
    }
}
