import java.util.Scanner;

class Main {
    static int serialNum;
    static String[] charList = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    static String output ="";
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        convertChar(n);
        System.out.println(output);

    }

    static long convertChar(long num){
        if(num==0){
            return 0;
        }
        output = charList[(int) ((num-1)%26)] + output;
        return convertChar((num-1)/26);
    }
}