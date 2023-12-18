import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int r0=0;
        int r1=0;
        for(int i=0;i<S.length();i++){
            if(i%2==0){
                if(S.charAt(i)!='0')r0++;
            } else {
                if(S.charAt(i)=='0')r0++;
            }
        }

        for(int i=0;i<S.length();i++){
            if(i%2==0){
                if(S.charAt(i)!='1')r1++;
            } else {
                if(S.charAt(i)=='1')r1++;
            }
        }

        System.out.println(Math.min(r0, r1));
    }
}