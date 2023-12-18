import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[]S = s.split(" ");
        sc.close();
        int a = Integer.parseInt(S[0]);
        int b = Integer.parseInt(S[1]);
        int c = Integer.parseInt(S[2]);
        
        String ans = "No";

        if((c > a && c < b) || (c > b && c < a)){
            ans = "Yes";
        }
        System.out.println(ans);
    } 
}    