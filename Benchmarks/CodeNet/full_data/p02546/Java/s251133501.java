import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        //System.out.println(N.charAt(N.length() -1));
        if(N.charAt(N.length() -1) == 's'){
            System.out.println(N + "es");
        }else{
            System.out.print(N + "s");
        }
    }
}
