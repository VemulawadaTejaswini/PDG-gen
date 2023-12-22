import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i<n; i++){
            str[i] = sc.next();
        }

        int acCount = 0;
        int waCount = 0;
        int tleCount = 0;
        int reCount = 0;

        for(int j = 0; j<n; j++){
            if(str[j].equals("AC")){
                acCount++;
            }
            else if(str[j].equals("WA")){
                waCount++;
            }
            else if(str[j].equals("TLE")){
                tleCount++;
            }
            else if(str[j].equals("RE")){
                reCount++;
            }
        }
        System.out.printf("AC x %d\n", acCount);
        System.out.printf("WA x %d\n", waCount);
        System.out.printf("TLE x %d\n", tleCount);
        System.out.printf("RE x %d\n", reCount);



    }
}