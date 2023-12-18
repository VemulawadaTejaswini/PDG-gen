import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int hoge = sc.nextInt();
        String sura = sc.next();
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < hoge; i++){
            if(i == 0){
                list.add(sura.charAt(i));
            }else{
                list.add(sura.charAt(i));
                if(list.get(list.size() - 2) == list.get(list.size() - 1)){
                    list.remove(list.size() - 1);
                }
            } 
        }
        System.out.println(list.size());
    }     
}