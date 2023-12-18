import java.util.Scanner;
class hajimete{
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] number = new int[2];
        for(int i = 0; i < 2; i++){
            number[i] = sc.nextInt();
        }
        if(number[0] < 10 && number[1] < 10){
            System.out.println(number[0] * number[1]);
        }else{
            System.out.println(-1);
        }
    }
}