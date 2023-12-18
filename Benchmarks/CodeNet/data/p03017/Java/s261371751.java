import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        String S = sc.next();
        sc.close();

        String[] strArray = S.split("");

        int result=0;

        if(D < C) {
            result = check3(strArray, B, D);
            if (result == 1){
                System.out.println("No");
                return;
            }

            result = check(strArray, A, C);
            if (result == 1){
                System.out.println("No");
                return;
            }

        }else{
            result = check(strArray, B, D);
            if (result == 1){
                System.out.println("No");
                return;
            }

            result = check(strArray, A, C);
            if (result == 1){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");



    }

    static int check(String[] s, int A, int C){
        int result=0;

        for (int i=A-1; i<s.length; i++){
            if (i >= (C-1)) break;

            if(s[i+1].equals("#")){
                i++;
                if (s[i+1].equals("#")){
                    result = 1;
                    break;
                }
            }

        }
        return result;
    }

    static int check3(String[] s, int A, int C){
        int result=1;
        for (int i=A-1; i<C-2; i++){
            if (s[i].equals(".") && s[i+1].equals(".") && s[i+2].equals(".")){
                result = 0;
                break;
            }
        }
        return result;
    }
}