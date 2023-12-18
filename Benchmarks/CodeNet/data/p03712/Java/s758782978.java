import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        System.out.println(charp(w+2));
        for(int i=0;i<h;i++){
            System.out.println("#"+sc.next()+"#");
        }
        System.out.println(charp(w+2));
    }
    static String charp(int input){
        String output="";
        for(int i=0;i<input;i++){
            output+="#";
        }
        return output;
    }
}