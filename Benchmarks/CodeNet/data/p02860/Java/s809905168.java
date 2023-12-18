import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int hoge = sc.nextInt();
        char array[] = new char[hoge];
        String a = sc.next();
        for(int i = 0; i < hoge; i++){
            array[i] = a.charAt(i);
        }
        if (hoge % 2 != 0){
            System.out.println("No");
        }else{
            for(int i = 0; i < hoge/2; i++){
                if(array[i] == array[hoge/2+i]){
                }else{
                    System.out.println("No");
                    System.exit(1);
                }
            }
            System.out.println("Yes");
        }      
    }     
}