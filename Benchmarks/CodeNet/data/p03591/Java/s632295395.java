import java.util.Scanner;
import java.util.stream.Collectors;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if(S.length()<4){
            System.out.println("No");
            return;
        }
        if(S.substring(0,4).equals("YAKI")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
