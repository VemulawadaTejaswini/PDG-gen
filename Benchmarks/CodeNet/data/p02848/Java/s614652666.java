import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        for(int i=0; i<s.length(); i++){
            System.out.print(change(n,s.charAt(i)));
        }
        System.out.println();
    }

    public static char change(int n,char c){
        int cint = (int)c;
        if(cint + n <= 90){
            return (char)(cint + n);
        } else {
            return (char)(cint + n - 26);
        }
    }
}