import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.next().split("");
        if(n[0].equals(n[1]) && n[1].equals(n[2])){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }

    }
}
