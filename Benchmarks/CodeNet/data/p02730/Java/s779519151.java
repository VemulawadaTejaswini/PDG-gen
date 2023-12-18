import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int a = 0;
        int b = 0;
        
        String[] sArray = new String[S.length()];
        for(int i = 0; i < S.length(); i++){
            String s2 = String.valueOf(S.charAt(i));
            sArray[i] = s2;
        }
        
        for(int i = 0; i < (S.length()-1)/2; i++){
            //System.out.print(i);
            if(sArray[i].equals(sArray[S.length() - (1+i)])){
                //続行
            }else{
                System.out.print("No");
                a++;
                b++;
                break;
            }
        }
        //System.out.print("a="+ a + " 長さ=" + (S.length()-1)/2);
        int N = S.length() - 1;
        if(a == 0){
            for(int i = 0; i < (S.length()-1)/4; i++){
                if(sArray[i].equals(sArray[(N / 2) - (1 + i)])){
                //続行
            }else{
                System.out.print("No");
                b++;
                break;
            }
            }
        }
        
        if(b == 0){
            System.out.print("Yes");
        }
    }
}