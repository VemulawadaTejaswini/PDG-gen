import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int hoge = sc.nextInt();
        ArrayList<Character> list = new ArrayList<>();
        String a = sc.next();
        for(int i = 0; i < hoge; i++){
            list.add(a.charAt(i));
        }
        if(hoge == 1){
            System.out.println("No");
        }else if (hoge % 2 != 0){
            System.out.println("No");
        }else{
            for(int i = 0; i < hoge/2; i++){
                if(list.get(i).equals(list.get(hoge/2+i))){
                }else{
                    System.out.println("No");
                    System.exit(1);;
                }
            }
            System.out.println("Yes");
        }      
    }
}