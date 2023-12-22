import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double Rj = 0;
        double Ri = 0;
        double newR;
        int value;
        for (int i=0; i<n-1; i++){
            newR = Integer.parseInt(scan.nextLine());
            if (i == 0){
                Rj = newR;
                Ri = newR;
                continue;
            }
            if (newR < Ri){
                Ri = newR;
                Rj = newR;
                continue;
            }
            if (newR > Rj){
                Rj = newR;
                continue;
            }
        }
        newR = Integer.parseInt(scan.nextLine());
        if (newR < Ri)
            Rj = newR;
        if (newR > Rj)
            Rj = newR;

        System.out.println((int)(Rj - Ri));
    }
}