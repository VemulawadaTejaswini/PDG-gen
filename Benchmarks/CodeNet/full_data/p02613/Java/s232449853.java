import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        String[] s = new String[n];
        for(int i=0; i<s.length; i++){
            s[i] = stdIn.next();
        }

        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for(int i=0; i<s.length; i++){
            if(s[i].equals("AC")){
                c0++;
            }else if(s[i].equals("WA")){
                c1++;
            }else if(s[i].equals("TLE")){
                c2++;
            }else{
                c3++;
            }
        }

        System.out.println("AC x " + c0);
        System.out.println("WA x " + c1);
        System.out.println("TLE x " + c2);
        System.out.println("RE x " + c3);
    }
}
