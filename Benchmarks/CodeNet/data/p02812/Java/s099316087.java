import java.util.Scanner;

public class Main {
    public static void main(String...args){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int found= 0;
        for(int i=2; i<N;i++){
            String check3 = Character.toString(S.charAt(i));
            String check2 = Character.toString(S.charAt(i-1));
            String check1 = Character.toString(S.charAt(i-2));
            if(check1.equals("A") && check2.equals("B") && check3.equals("C")){
                found++;
            }
        }
        System.out.println(found);
    }
}
