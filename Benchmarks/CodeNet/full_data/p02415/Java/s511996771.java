import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String low = str.toLowerCase();
        String up = str.toUpperCase();
        
        for(int i = 0 ; i < str.length() ; i++ ){
            if(str.charAt(i) == low.charAt(i)){
                System.out.print(up.charAt(i));
            } else {
                System.out.print(low.charAt(i));
            }
        }
        System.out.println();
        
    }
}
