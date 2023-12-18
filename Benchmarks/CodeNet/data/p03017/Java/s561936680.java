import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt()-1;
        int b = scanner.nextInt()-1;
        int c = scanner.nextInt()-1;
        int d = scanner.nextInt()-1;
        String s = scanner.next();

        if(c < d){System.out.println("Yes");return;}
        for(int i = b; i < d-2; i++){
            if(s.charAt(i) == '.' && s.charAt(i+1) == '.' && s.charAt(i+2) == '.'){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
