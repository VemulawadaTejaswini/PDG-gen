import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        int b =scn.nextInt();
        int x= scn.nextInt();
        String answer = "NO";
        if(a<=x&&a+b>=x) answer = "YES";
        System.out.println(answer);
    }
}