import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String x = sc.next();
        char[] cary = x.toCharArray();

        for(char i = 'a';i <= 'z' ;i++){
            if(!charAryHasChar(cary,i)){
                System.out.print(i);
                return;
            }
        }
        System.out.print("None");

    }

    private static boolean charAryHasChar(char[] charary,char needle){
        boolean result = false;
        int l = charary.length;

        for(int j = 0;j<l;j++ ){
            if(needle == charary[j]){
                result= true;
                break;
            }
        }
        return  result;
    }
}