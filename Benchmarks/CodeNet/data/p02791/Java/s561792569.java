import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int number[] = new int[n];
        int count = 0;
        boolean compare = true;

        for(int i = 0; i < n;i++) number[i] = scan.nextInt();
        scan.close();

        for(int j = 0; j < n;j++){
            for(int k = 0; k <= j; k++) {if(number[j] > number[k]) compare = false; continue;}
            if(compare) count++;
            compare = true;
        }

        System.out.println(count);
    }
}