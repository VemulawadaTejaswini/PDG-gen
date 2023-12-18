import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char A[] = S.toCharArray();

        int count = 0;
        for(int i = 0;i < 3;i++){
            if(A[i] == A[i+1]){
                count++;
            }
        }
        if(count > 0){
            System.out.println("Bad");
        }else{
            System.out.println("Good");
        }

    }
}