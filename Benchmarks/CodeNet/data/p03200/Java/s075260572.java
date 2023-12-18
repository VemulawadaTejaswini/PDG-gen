import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int kai=0;
        int Bs=0;

        int i=0;
        for(i=0; i<s.length(); i++){
            if(s.charAt(i)=='B'){Bs++;kai+=(s.length()-i)-Bs;}
        }
        System.out.println(kai);
    }
}
