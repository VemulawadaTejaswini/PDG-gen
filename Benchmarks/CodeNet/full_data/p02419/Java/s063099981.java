import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        
        String W = sc.next();
        sc.nextLine();
        
        for(;;){
            String T = sc.next();
            if(T.equals("END_OF_TEXT")) break;
            T = T.toLowerCase();
            if(T.equals(W)) cnt++;
        }
        System.out.println(cnt);
    }
}
