import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        String  a = String.valueOf(N);
        char b[] = new char[a.length()];
        for (int i=0;i<a.length();i++){
            b[i] = a.charAt(i);
        }
        int divid =0;
        for (int i=0;i<a.length();i++){
            divid += b[i];
        }
        if(N % divid ==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }