import java.util.Scanner

class Main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] c = str.toCharArray();
        String a = String.valueOf(c[0]);
        String b = String.valueOf(c[1]);
        int c = int(a)*int(b);
        if (c%2==0){
        System.out.println("Even");
        }else{
        System.out.pritnln("Odd");
        }
        
        

}
}