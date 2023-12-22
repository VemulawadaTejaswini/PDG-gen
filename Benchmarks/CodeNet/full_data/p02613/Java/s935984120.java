import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        String[] s = new String[n];
        for(int i = 0 ; i < n ; i++){
            s[i] = stdIn.nextLine();
        }
        int[] c = {0 , 0 , 0 , 0};
        for(int i = 0 ; i < n ; i++){
            if(s[i] == "AC"){
                c[0] += 1;
            }else if(s[i] == "WA"){
                c[1] += 1;
            }else if(s[i] == "TLE"){
                c[2] += 1;
            }else if(s[i] == "RE") {
                c[3] += 1;
            }
        }
        System.out.println("AC x " + c[0]);
        System.out.println("WA x " + c[1]);
        System.out.println("TLE x " + c[2]);
        System.out.println("RE x " + c[3]);
    }
}
