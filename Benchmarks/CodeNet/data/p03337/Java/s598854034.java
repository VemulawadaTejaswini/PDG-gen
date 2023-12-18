import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();
        String S = sc.next();
        char[] A = S.toCharArray();

        int countE = 0;
        int countW = 0;
        for(int i = 0; i < N; i++){
            if(A[i] ==  'E'){
                countE++;
            }else{
                countW++;
            }
        }

        if (countE >= countW) {
            System.out.println(countW);
        }else{
            System.out.println(countE);
        }
    }
}