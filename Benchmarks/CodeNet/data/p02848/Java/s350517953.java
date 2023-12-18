import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int hoge1 = sc.nextInt();
        String hoge = sc.next();
        char[] array = new char[hoge.length()];
        for(int i = 0; i < hoge.length(); i++){
            array[i] = hoge.charAt(i);
        }
        for(int i = 0; i <hoge.length(); i++){
           int asc = (array[i] + hoge1);
           if(asc > 90){
               asc-=26;
           }
           array[i] = (char)asc;
        }
        for(int i = 0; i <hoge.length(); i++){
            System.out.print(array[i]);
        }
    }     
}