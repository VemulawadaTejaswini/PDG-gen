import java.util.Scanner;

class Calc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a[] = s.split(" ");
        int[] b = new int[3];
        int add, dec, div;

        for(int i = 0; i < a.length; i++){
            b[i] = Integer.parseInt(a[i]);
        }

        add = b[0] + b[1];
        dec = b[0] - b[1];
        div = b[0] * b[1];

        int max = add;

        if(max < dec){
            max = dec;
        }

        if(max < div){
            max = div;
        }

        System.out.println(max);
    }
}