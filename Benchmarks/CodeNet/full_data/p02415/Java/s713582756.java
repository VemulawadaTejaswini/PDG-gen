import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        
        
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (Character.isUpperCase(c)){
                System.out.print(Character.toLowerCase(c));
            }else if (Character.isLowerCase(c)){
                System.out.print(Character.toUpperCase(c));
            }else{
                System.out.print(c);
            }
        }
        System.out.println();
    }
}
