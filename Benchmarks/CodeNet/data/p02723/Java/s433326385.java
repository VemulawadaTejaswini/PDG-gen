import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        String s=stdIn.next();

        char[] c=s.toCharArray();

        if(c[2]==c[3]&&c[4]==c[5]){
            System.out.println("Yes");
            
        }
        else{
            System.out.println("No");
            
        }
        
        
    }

}