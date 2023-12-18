import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int result = 0;
        if(1<=Integer.parseInt(a)&&Integer.parseInt(a)<=(Math.pow(10,9))){
            for (int i = 1; i<(a.length()+1); i++){
                int kekka = Integer.parseInt(a.substring(i-1, i));
                int hai = 0;
                result += kekka;
            }
            if((Integer.parseInt(a)%result) == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
