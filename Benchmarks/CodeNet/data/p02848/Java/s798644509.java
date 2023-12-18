import java.util.Scanner;

class Contest_B{
    public static void main(String[] args){
        final String ALPHA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int n;
        
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        String str = sc.next();
        String result = "";

        for(int i = 0;i < str.length();i++){
            char c = str.charAt(i);
            n = ALPHA.indexOf(c) + ch;
            if(n >= 26) n = n - 26;
            result.concat((String)ALPHA.charAt(n));
        }
            
            System.out.println(result);
    }
}